import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mk extends JFrame implements ActionListener {

    JLabel nameLabel, rollNoLabel, physicsLabel, chemistryLabel, mathsLabel, EnglishLabel, TamilLabel, ComputerScienceLabel, totalLabel, percentageLabel, divisionLabel;
    JTextField nameField, rollNoField, physicsField, chemistryField, mathsField, EnglishField, TamilField,ComputerScienceField, totalField, percentageField, divisionField;
    JButton calculateButton, clearButton;

    public Mk() {
        setTitle("Mark Sheet");
        setSize(500, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 50, 200, 30);
        add(nameField);

        rollNoLabel = new JLabel("Roll No:");
        rollNoLabel.setBounds(50, 100, 100, 30);
        add(rollNoLabel);

        rollNoField = new JTextField();
        rollNoField.setBounds(200, 100, 200, 30);
        add(rollNoField);

        physicsLabel = new JLabel("Physics:");
        physicsLabel.setBounds(50, 150, 100, 30);
        add(physicsLabel);

        physicsField = new JTextField();
        physicsField.setBounds(200, 150, 200, 30);
        add(physicsField);

        chemistryLabel = new JLabel("Chemistry:");
        chemistryLabel.setBounds(50, 200, 100, 30);
        add(chemistryLabel);

        chemistryField = new JTextField();
        chemistryField.setBounds(200, 200, 200, 30);
        add(chemistryField);

        mathsLabel = new JLabel("Maths:");
        mathsLabel.setBounds(50, 250, 100, 30);
        add(mathsLabel);

        mathsField = new JTextField();
        mathsField.setBounds(200, 250, 200, 30);
        add(mathsField);

        EnglishLabel = new JLabel("english:");
        EnglishLabel.setBounds(50, 300, 100, 30);
        add(EnglishLabel);

        EnglishField = new JTextField();
        EnglishField.setBounds(200, 300, 200, 30);
        add(EnglishField);

        TamilLabel = new JLabel("tamil:");
        TamilLabel.setBounds(50, 350, 100, 30);
        add(TamilLabel);

        TamilField = new JTextField();
        TamilField.setBounds(200, 350, 200, 30);
        add(TamilField);

        ComputerScienceLabel = new JLabel("ComputerScience:");
        ComputerScienceLabel.setBounds(50, 400, 100, 30);
        add(ComputerScienceLabel);

        ComputerScienceField = new JTextField();
        ComputerScienceField.setBounds(200, 400, 200, 30);
        add(ComputerScienceField);




        totalLabel = new JLabel("Total:");
        totalLabel.setBounds(50, 450, 100, 30);
        add(totalLabel);

        totalField = new JTextField();
        totalField.setBounds(200, 450, 200, 30);
        totalField.setEditable(false);
        add(totalField);

        percentageLabel = new JLabel("Percentage:");
        percentageLabel.setBounds(50, 500, 100, 30);
        add(percentageLabel);

        percentageField = new JTextField();
        percentageField.setBounds(200, 500, 200, 30);
        percentageField.setEditable(false);
        add(percentageField);

        divisionLabel = new JLabel("Division:");
        divisionLabel.setBounds(50, 550, 100, 30);
        add(divisionLabel);

        divisionField = new JTextField();
        divisionField.setBounds(200, 550, 200, 30);
        divisionField.setEditable(false);
        add(divisionField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150, 600, 100, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(300, 600, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int physicsMarks = Integer.parseInt(physicsField.getText());
            int chemistryMarks = Integer.parseInt(chemistryField.getText());
            int mathsMarks = Integer.parseInt(mathsField.getText());
            int EnglishMarks = Integer.parseInt(EnglishField.getText());
            int TamilMarks = Integer.parseInt(TamilField.getText());
            int ComputerScienceMarks = Integer.parseInt(ComputerScienceField.getText());
            int totalMarks = physicsMarks + chemistryMarks + mathsMarks + EnglishMarks + TamilMarks + ComputerScienceMarks;
            double percentage = (double) totalMarks / 6;

            totalField.setText(String.valueOf(totalMarks));
            percentageField.setText(String.valueOf(percentage));

            if (percentage >= 60) {
                divisionField.setText("First");
            } else if (percentage >= 45) {
                divisionField.setText("Second");
            } else if (percentage >= 33) {
                divisionField.setText("Third");
            } else {
                divisionField.setText("Fail");
            }
        } else if (e.getSource() == clearButton) {
            nameField.setText("");
            rollNoField.setText("");
            physicsField.setText("");
            chemistryField.setText("");
            mathsField.setText("");
            EnglishField.setText("");
            TamilField.setText("");
            ComputerScienceField.setText("");
            totalField.setText("");
            percentageField.setText("");
            divisionField.setText("");

        }
    }
    public static void main(String[] args) {
        new Mk();
    }
}