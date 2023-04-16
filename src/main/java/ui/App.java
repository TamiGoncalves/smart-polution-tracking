import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class App extends JFrame implements ServiceListener {

    // User interface
    JPanel column1 = new JPanel();
    JPanel column2 = new JPanel();
    JPanel column3 = new JPanel();

    // Table properties
    String[] sensorHeader = {"v1", "v2", "v3", "v4", "v5"};
    DefaultTableModel waterModel = new DefaultTableModel(sensorHeader, 0);
    DefaultTableModel waterQModel = new DefaultTableModel(sensorHeader, 0);

    // Service properties
    private ServiceHost wHost = null;
    private ServiceHost aHost = null;
    private ServiceHost anHost = null;




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

        JButton startWaterQualityMonitoring = new JButton("Start Air Quality");
        toggleButtonColor("Water quality", startWaterQualityMonitoring, true);
        JButton startairQualityMonitoring = new JButton("Start Water Quality");
        toggleButtonColor("Air quality", startWaterQualityMonitoring, true);
        JButton startAnalysis = new JButton("Start Analysis");
        toggleButtonColor("Analysis", startAnalysis, true);

        startairQualityMonitoring.addActionListener(actionEvent -> {

            if (startairQualityMonitoring.getForeground().equals(Color.RED)) {
                startairQualityMonitoring.setText("Start Air Monitoring");
                toggleButtonColor("", startairQualityMonitoring, true);
                return;
            }
            aHost = getServiceHost();
            if(aHost != null) {
                startairQualityMonitoring.setText("Stop Air Monitoring");
                toggleButtonColor("Air quality", startairQualityMonitoring, false);

            }
        });

        startWaterQualityMonitoring.addActionListener(actionEvent -> {

            if (startWaterQualityMonitoring.getForeground().equals(Color.RED)) {
                startWaterQualityMonitoring.setText("Start Water Monitoring");
                toggleButtonColor("", startWaterQualityMonitoring, true);
                return;
            }

            wHost = getServiceHost();
            if(wHost != null) {
                startWaterQualityMonitoring.setText("Stop Water Monitoring");
                toggleButtonColor("Water quality", startWaterQualityMonitoring, false);
            }
        });

        startAnalysis.addActionListener(actionEvent -> {

            if (startAnalysis.getForeground().equals(Color.RED)) {
                startAnalysis.setText("Start Water Monitoring");
                toggleButtonColor("", startAnalysis, true);
                return;
            }

            anHost = getServiceHost();
            if(aHost != null) {
                startAnalysis.setText("Stop Analysis");
                toggleButtonColor("Analysis quality", startAnalysis, false);
            }
        });

        buttonPanel.add(startWaterQualityMonitoring);
        buttonPanel.add(startairQualityMonitoring);
        buttonPanel.add(startAnalysis);

        column1.add(bannerLabel, BorderLayout.NORTH);
        column1.add(buttonPanel, BorderLayout.CENTER);

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

        addDataBtn.addActionListener(e->{
            Object[] sensorValuesFromUser = getSensorValuesFromUser();
            if (sensorValuesFromUser != null) {
                waterModel.addRow(sensorValuesFromUser);
            }
        });

        buttonPanel.add(addDataBtn);

        column2.add(buttonPanel, BorderLayout.NORTH);
        column2.add(scrollPane, BorderLayout.CENTER);
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

        addDataBtn.addActionListener(e->{
            Object[] sensorValuesFromUser = getSensorValuesFromUser();
            if (sensorValuesFromUser != null) {
                waterQModel.addRow(sensorValuesFromUser);
            }
        });

        btnPanel.add(addDataBtn);

        column3.add(btnPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(table);

        column3.add(scrollPane, BorderLayout.CENTER);
    }



    public static ServiceHost getServiceHost() {
        String location = JOptionPane.showInputDialog(null, "Enter the host name:", "Service Host", JOptionPane.PLAIN_MESSAGE);
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
