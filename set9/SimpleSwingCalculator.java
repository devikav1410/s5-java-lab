import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingCalculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn;

    public SimpleSwingCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Input fields
        add(new JLabel("Number 1:"));
        num1Field = new JTextField(10);
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField(10);
        add(num2Field);

        // Buttons
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");

        add(addBtn); add(subBtn); add(mulBtn); add(divBtn);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        // Result field
        add(new JLabel("Result:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addBtn) result = num1 + num2;
            else if (e.getSource() == subBtn) result = num1 - num2;
            else if (e.getSource() == mulBtn) result = num1 * num2;
            else if (e.getSource() == divBtn) {
                if (num2 == 0) {
                    resultField.setText("Error: Divide by 0");
                    return;
                }
                result = num1 / num2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleSwingCalculator();
    }
}
