
/**
 *
 * @author angieluz cervania
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class COR extends JFrame {

    // JTextField
    private JTextField txtCostPerUnit;
    private JTextField txtTotalTuition;

    // JButton
    private JButton btnCompute;

    public COR() {
        setTitle("FEU Tech Student Portal - Schedule and Assessment");
        setSize(950, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        //Student Information
        JPanel panelInfo = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInfo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelInfo.add(new JLabel("Enrollment Status: ENROLLED"));
        panelInfo.add(new JLabel("College: COMPUTER STUDIES"));
        panelInfo.add(new JLabel("Student #: 202411637"));
        panelInfo.add(new JLabel("Program: BSCSSE"));
        panelInfo.add(new JLabel("Name: CERVANIA, URIEL JOSHUA VICERAL"));
        panelInfo.add(new JLabel("Year Level: 2   1st term, SY 26-27"));
        panelInfo.add(new JLabel("Phone: +639458692285"));
        panelInfo.add(new JLabel("Address: Unit 2006, Tower 2, Grass Residences"));

        add(panelInfo, BorderLayout.NORTH);

        //Courses Schedule Table
        String[] columnNames = {"Courses", "Title", "Section", "Units", "Days", "Time", "Room"};
        Object[][] data = {
            {"CS0016", "NETWORK AND COMMUNICATIONS 2A", "TN32", "3", "F / W", "09:00:00-10:50:00 / 09:00:00-10:50:00", "ONLINE / F1101"},
            {"CS0070", "OBJECT ORIENTED PROGRAMMING", "TA21", "2", "T", "10:00:00-12:40:00", "ONLINE"},
            {"CS0070L", "OBJECT ORIENTED PROGRAMMING-LAB", "TA21", "1", "M", "10:00:00-12:50:00", "E609"},
            {"GED0019", "UNDERSTANDING THE SELF", "TC21", "3", "F / T", "17:00:00-18:50:00 / 17:00:00-18:50:00", "ONLINE / ONLINE"},
            {"GED0047", "FOREIGN LANGUAGE", "TL21", "3", "F / T", "13:00:00-14:50:00 / 13:00:00-14:50:00", "ONLINE / ONLINE"},
            {"GED0049", "LIFE AND WORKS OF RIZAL", "TN43", "3", "F / T", "07:00:00-08:50:00 / 07:00:00-08:50:00", "ONLINE / ONLINE"},
            {"GED0061", "ETHICS", "TE41", "3", "F / T", "15:00:00-16:50:00 / 15:00:00-16:50:00", "ONLINE / ONLINE"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        JLabel lblTotalUnits = new JLabel("TOTAL UNITS: 18");
        centerPanel.add(lblTotalUnits, BorderLayout.SOUTH);

        add(centerPanel, BorderLayout.CENTER);

        //Tuition Computation
        JPanel panelBottom = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelBottom.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        txtCostPerUnit = new JTextField("2108.00", 8);
        txtTotalTuition = new JTextField("37,944.00", 10);
        txtTotalTuition.setEnabled(false);

        btnCompute = new JButton("Compute Tuition Fee");

        panelBottom.add(new JLabel("Cost Per Unit:"));
        panelBottom.add(txtCostPerUnit);
        panelBottom.add(btnCompute);
        panelBottom.add(new JLabel("Tuition Fee Total:")); // Excluded Miscellaneous Fees and Lab Fees
        panelBottom.add(txtTotalTuition);

        add(panelBottom, BorderLayout.SOUTH);

        // Action Listener
        btnCompute.addActionListener(e -> computeTuition());
    }

    public void computeTuition() {
        try {
            double costPerUnit = Double.parseDouble(txtCostPerUnit.getText().trim());
            int totalUnits = 18;

            if (costPerUnit < 0) {
                throw new NumberFormatException();
            }

            // Computation is tuition fee only (cost per unit * 18 units) excluding miscellaneous fees
            double totalTuition = costPerUnit * totalUnits;
            txtTotalTuition.setText(String.format("%,.2f", totalTuition));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid number for cost per unit!"
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new COR().setVisible(true);
        });
    }
}