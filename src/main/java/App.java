import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
    JPanel column1 = new JPanel();
    JPanel column2 = new JPanel();
    JPanel column3 = new JPanel();


    public App() {
        // Set up the JFrame
        setTitle("Data analysis service");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024, 800);

        // Create a JPanel to hold the three columns
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create the three columns with spacing and a round border

        column1.setPreferredSize(new Dimension(200, 0));
        column1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        column1.setBackground(Color.GRAY);
        column1.setLayout(new BorderLayout());
        column1.add(new JLabel("Controls"), BorderLayout.CENTER);
        column1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 20),
            BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 12)));

        column2.setPreferredSize(new Dimension(200, 0));
        column2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
        column2.setBackground(Color.GRAY);
        column2.setLayout(new BorderLayout());
        column2.add(new JLabel("Air quality"), BorderLayout.CENTER);
        column2.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(0, 0, 0, 20),
            BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 12)));

        column3.setPreferredSize(new Dimension(200, 0));
        column3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        column3.setBackground(Color.GRAY);
        column3.setLayout(new BorderLayout());
        column3.add(new JLabel("Column 3"), BorderLayout.CENTER);
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

        // Add the main panel to the JFrame
        getContentPane().add(mainPanel);

        // Show the JFrame
        setVisible(true);
    }


    private void setupButtons() {
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));
        buttonPanel.setBackground(Color.GRAY);

        JButton startWaterQualityMonitoring = new JButton("Button 1");
        JButton startairQualityMonitoring = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        buttonPanel.add(startWaterQualityMonitoring);
        buttonPanel.add(startairQualityMonitoring);
        buttonPanel.add(button3);

        column1.add(buttonPanel, BorderLayout.NORTH);

    }



    private void updateAirSensorData(float[] data) {

    }
}
