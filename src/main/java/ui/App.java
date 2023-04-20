package ui;

import airquality.AirQualityService;
import analysis.AnalysisService;
import hooks.ServiceEventListener;
import waterquality.WaterQualityService;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class App extends JFrame implements ServiceEventListener {

    // User interface
    JPanel column1 = new JPanel();
    JPanel column2 = new JPanel();
    JPanel column3 = new JPanel();

    // Table properties
    String[] sensorHeader = {"NO2", "CH4", "HCNM", "O3", "SO2"};
    ArrayList<String> sensorValues = new ArrayList<>();
    DefaultTableModel waterModel = new DefaultTableModel(sensorHeader, 0);
    DefaultTableModel waterQModel = new DefaultTableModel(sensorHeader, 0);

    // Service properties
    private ServiceHost wHost = null;
    private ServiceHost aHost = null;
    private ServiceHost anHost = null;

    private final WaterQualityService waterQualityService = new WaterQualityService();
    private final AirQualityService airQualityService = new AirQualityService();
    private final AnalysisService analysisService = new AnalysisService();

    private boolean analysisServiceStarted = false;




    public App() {
        // Set up the JFrame
        setTitle("Data analysis service");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);

        // Create a JPanel to hold the three columns
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create the three columns with spacing and a round border

        column1.setPreferredSize(new Dimension(200, 0));
        column1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        column1.setBackground(Color.GRAY);
        column1.setLayout(new BorderLayout());
        column1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 20),
            BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 12)));

        column2.setPreferredSize(new Dimension(200, 0));
        column2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        column2.setBackground(Color.GRAY);
        column2.setLayout(new BorderLayout());
        column2.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 20),
            BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 12)));

        column3.setPreferredSize(new Dimension(200, 0));
        column3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        column3.setBackground(Color.GRAY);
        column3.setLayout(new BorderLayout());
        column3.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 20),
            BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 12)));

        // Add the columns to the main panel
        mainPanel.add(column1);
        mainPanel.add(Box.createHorizontalStrut(20));
        mainPanel.add(column2);
        mainPanel.add(Box.createHorizontalStrut(20));
        mainPanel.add(column3);

        setupButtons();

        setupAirQualityTable();
        setupWaterQualityTable();

        // Add the main panel to the JFrame
        getContentPane().add(mainPanel);

        // Show the JFrame
        setVisible(true);
    }


    private void setupButtons() {
        // Add banner Image
        // Add banner image to the first column
        ImageIcon bannerIcon = new ImageIcon("src/main/assets/banner.jpg");
        JLabel bannerLabel = new JLabel(bannerIcon);


        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        buttonPanel.setBackground(Color.GRAY);

        JButton startWaterQualityMonitoring = new JButton("Start Water Quality");
        toggleButtonColor("Water quality", startWaterQualityMonitoring, true);
        JButton startairQualityMonitoring = new JButton("Start Air Quality");
        toggleButtonColor("Air quality", startairQualityMonitoring, true);
        JButton startAnalysis = new JButton("Start Analysis");
        toggleButtonColor("Analysis", startAnalysis, true);

        startairQualityMonitoring.addActionListener(actionEvent -> {

            if (startairQualityMonitoring.getForeground().equals(Color.RED)) {
                startairQualityMonitoring.setText("Start Air Monitoring");
                toggleButtonColor("", startairQualityMonitoring, true);
                try {
                    airQualityService.stop();
                } catch (InterruptedException ignore) {
                    JOptionPane.showMessageDialog(null, ignore.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                return;
            }
            aHost = getServiceHost();
            if(aHost != null) {
                startairQualityMonitoring.setText("Stop Air Monitoring");
                toggleButtonColor("Air quality", startairQualityMonitoring, false);
                airQualityService.setServiceListener(this);
                try {
                    airQualityService.startServer(aHost.getPort());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        startWaterQualityMonitoring.addActionListener(actionEvent -> {

            if (startWaterQualityMonitoring.getForeground().equals(Color.RED)) {
                startWaterQualityMonitoring.setText("Start Water Monitoring");
                toggleButtonColor("", startWaterQualityMonitoring, true);
                try {
                    waterQualityService.stop();
                } catch (InterruptedException ignore) {
                    JOptionPane.showMessageDialog(null, ignore.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                return;
            }

            wHost = getServiceHost();
            if(wHost != null) {
                startWaterQualityMonitoring.setText("Stop Water Monitoring");
                toggleButtonColor("Water quality", startWaterQualityMonitoring, false);
                waterQualityService.setServiceListener(this);
                try {
                    waterQualityService.startServer(wHost.getPort());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    wHost = null;
                }
            }
        });

        startAnalysis.addActionListener(actionEvent -> {

            if (startAnalysis.getForeground().equals(Color.RED)) {
                startAnalysis.setText("Start Analysis");
                toggleButtonColor("", startAnalysis, true);
                try {
                    analysisService.stop();
                    analysisServiceStarted = false;
                } catch (InterruptedException ignore) {
                    JOptionPane.showMessageDialog(null, ignore.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    analysisServiceStarted = true;
                }
                return;
            }

            anHost = getServiceHost();
            if(anHost != null) {
                startAnalysis.setText("Stop Analysis");
                toggleButtonColor("Analysis quality", startAnalysis, false);
            }


            try {
                analysisService.startServer(anHost.getPort());
                analysisServiceStarted = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                anHost = null;
                analysisServiceStarted = false;

            }
        });

        buttonPanel.add(startWaterQualityMonitoring);
        buttonPanel.add(startairQualityMonitoring);
        buttonPanel.add(startAnalysis);

        column1.add(bannerLabel, BorderLayout.NORTH);
        column1.add(buttonPanel, BorderLayout.CENTER);

    }


    public static String calculateAirQuality(double no2Level) {
        int aqi;
        String category;

        if (no2Level >= 0 && no2Level <= 53) {
            aqi = (int) Math.round((50.0/53.0)*(no2Level));
            category = "Good";
        } else if (no2Level >= 54 && no2Level <= 100) {
            aqi = (int) Math.round(((100.0-51.0)/(100.0-54.0))*(no2Level-54.0)+51.0);
            category = "Moderate";
        } else if (no2Level >= 101 && no2Level <= 360) {
            aqi = (int) Math.round(((150.0-101.0)/(360.0-101.0))*(no2Level-101.0)+101.0);
            category = "Unhealthy for Sensitive Groups";
        } else if (no2Level >= 361 && no2Level <= 649) {
            aqi = (int) Math.round(((200.0-151.0)/(649.0-361.0))*(no2Level-361.0)+151.0);
            category = "Unhealthy";
        } else if (no2Level >= 650 && no2Level <= 1249) {
            aqi = (int) Math.round(((300.0-201.0)/(1249.0-650.0))*(no2Level-650.0)+201.0);
            category = "Very Unhealthy";
        } else {
            aqi = (int) Math.round(((500.0-301.0)/(2049.0-1250.0))*(no2Level-1250.0)+301.0);
            category = "Hazardous";
        }

        return "AQI: " + aqi + " (" + category + ")";
    }

    public static String calculateWaterQuality(double no2Level) {
        int aqi;
        String category;

        if (no2Level >= 0 && no2Level <= 53) {
            aqi = (int) Math.round((50.0/53.0)*(no2Level));
            category = "Good";
        } else if (no2Level >= 54 && no2Level <= 100) {
            aqi = (int) Math.round(((100.0-51.0)/(100.0-54.0))*(no2Level-54.0)+51.0);
            category = "Moderate";
        } else if (no2Level >= 101 && no2Level <= 360) {
            aqi = (int) Math.round(((150.0-101.0)/(360.0-101.0))*(no2Level-101.0)+101.0);
            category = "Unhealthy for Sensitive Groups";
        } else if (no2Level >= 361 && no2Level <= 649) {
            aqi = (int) Math.round(((200.0-151.0)/(649.0-361.0))*(no2Level-361.0)+151.0);
            category = "Unhealthy";
        } else if (no2Level >= 650 && no2Level <= 1249) {
            aqi = (int) Math.round(((300.0-201.0)/(1249.0-650.0))*(no2Level-650.0)+201.0);
            category = "Very Unhealthy";
        } else {
            aqi = (int) Math.round(((500.0-301.0)/(2049.0-1250.0))*(no2Level-1250.0)+301.0);
            category = "Hazardous";
        }

        return "WQI: " + aqi + " (" + category + ")";
    }


    private void setupAirQualityTable() {
        // Create the table with 5 columns
        JTable airQualityTbl;
        airQualityTbl = new JTable(waterModel);
        airQualityTbl.setPreferredScrollableViewportSize(new Dimension(500, 70));
        airQualityTbl.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(airQualityTbl);
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        buttonPanel.setBackground(Color.GRAY);

        JButton addDataBtn = new JButton("Add Air Sensor Values");
        JLabel airqualityLabel = new JLabel("AIR QUALITY:");
        airqualityLabel.setForeground(Color.WHITE);
        final float[] average = {0};
        AtomicInteger count= new AtomicInteger();
        final int[] sum = {0};
        addDataBtn.addActionListener(e->{
            String[] V = getSensorValuesFromUser();
            if (V != null) {
                count.getAndIncrement();
                sum[0] += Integer.parseInt(V[0]);
                average[0] = (float) sum[0] / count.get();
                if (analysisServiceStarted)airqualityLabel.setText("AIR QUALITY: " + calculateAirQuality(average[0]));
                waterModel.addRow(V);
            }
        });

        buttonPanel.add(addDataBtn);

        JPanel bannerPanel = new JPanel();
        bannerPanel.setBackground(Color.BLUE);
        airqualityLabel.setFont(new Font("Arial", Font.BOLD, 18));
        bannerPanel.add(airqualityLabel);

        column2.add(buttonPanel, BorderLayout.NORTH);
        column2.add(scrollPane, BorderLayout.CENTER);
        column2.add(bannerPanel, BorderLayout.SOUTH);
    }


    private void setupWaterQualityTable() {
        // Create the table with 5 columns
        JTable table;
        table = new JTable(waterQModel);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        JPanel btnPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        btnPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        //
        btnPanel.setBackground(Color.GRAY);

        JButton addDataBtn = new JButton("Add Water Sensor Values");
        JLabel waterQualityLabel = new JLabel("WATER QUALITY:");
        waterQualityLabel.setForeground(Color.WHITE);
        final float[] average = {0};
        AtomicInteger count= new AtomicInteger();
        final int[] sum = {0};
        addDataBtn.addActionListener(e->{
            String[] sensorValuesFromUser = getSensorValuesFromUser();
            if (sensorValuesFromUser != null) {
                count.getAndIncrement();
                sum[0] += Integer.parseInt(sensorValuesFromUser[0]);
                average[0] = (float) sum[0] / count.get();
                if (analysisServiceStarted)waterQualityLabel.setText("WATER QUALITY: " + calculateWaterQuality(average[0]));
                waterQModel.addRow(sensorValuesFromUser);
            }
        });

        btnPanel.add(addDataBtn);

        column3.add(btnPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(table);


        JPanel bannerPanel = new JPanel();
        bannerPanel.setBackground(Color.BLUE);
        waterQualityLabel.setFont(new Font("Arial", Font.BOLD, 18));
        bannerPanel.add(waterQualityLabel);

        column3.add(scrollPane, BorderLayout.CENTER);
        column3.add(bannerPanel, BorderLayout.SOUTH);
    }



    public static ServiceHost getServiceHost() {
        String location = JOptionPane.showInputDialog(null, "Enter the Location ID:", "Location ID", JOptionPane.PLAIN_MESSAGE);
        if (location.length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Invalid location.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String host = JOptionPane.showInputDialog(null, "Enter the host name:", "Service Host", JOptionPane.PLAIN_MESSAGE);
        if (host.length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Invalid host.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        String portStr = JOptionPane.showInputDialog(null, "Enter the port number:", "Service Host", JOptionPane.PLAIN_MESSAGE);
        try {
            Integer.parseInt(portStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid port number.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }


        return new ServiceHost(host, portStr, location);
    }


    private static void toggleButtonColor(String text, JButton btn, boolean normal) {
        if (normal) {
            btn.setOpaque(true);
            btn.setForeground(Color.BLACK);
        } else  {
            btn.setOpaque(true);
            btn.setForeground(Color.RED);
        }
    }


    public static String[] getSensorValuesFromUser() {
        String input = JOptionPane.showInputDialog(null, "Enter 5 sensor values (comma-separated):");
        if (input == null) {
            return null; // user clicked cancel or closed the dialog
        }
        String[] values = input.split(",");
        if (values.length != 5) {
            JOptionPane.showMessageDialog(null, "Please enter exactly 5 values.");
            return getSensorValuesFromUser(); // recursively prompt again
        }
        return values;
    }


    @Override
    public void onAirQualitySend(Object[] data) {

    }

    @Override
    public void onWaterQualitySend(Object[] data) {

    }

    @Override
    public void onAnalysis(Object[][] data) {

    }
}
