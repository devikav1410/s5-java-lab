import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentMarkList extends JFrame implements ActionListener {
    JTextField nameField, regField, m1Field, m2Field, m3Field;
    JButton calcBtn, clearBtn, exitBtn;
    JTextArea outputArea;

    public StudentMarkList() {
        setTitle("Student Mark List");
        setSize(400, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Register No:"));
        regField = new JTextField(15);
        add(regField);

        add(new JLabel("Mark 1:"));
        m1Field = new JTextField(5);
        add(m1Field);

        add(new JLabel("Mark 2:"));
        m2Field = new JTextField(5);
        add(m2Field);

        add(new JLabel("Mark 3:"));
        m3Field = new JTextField(5);
        add(m3Field);

        calcBtn = new JButton("Calculate");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        add(calcBtn); add(clearBtn); add(exitBtn);

        calcBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        outputArea = new JTextArea(6, 30);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcBtn) {
            try {
                int m1 = Integer.parseInt(m1Field.getText());
                int m2 = Integer.parseInt(m2Field.getText());
                int m3 = Integer.parseInt(m3Field.getText());

                // Validate marks
                if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                    outputArea.setText("Error: Marks must be between 0 and 100.");
                    return;
                }

                int total = m1 + m2 + m3;
                double avg = total / 3.0;
                String grade;

                if (avg >= 90) grade = "A";
                else if (avg >= 75) grade = "B";
                else if (avg >= 50) grade = "C";
                else grade = "Fail";

                outputArea.setText("Name: " + nameField.getText() +
                                   "\nRegister No: " + regField.getText() +
                                   "\nTotal: " + total +
                                   "\nAverage: " + avg +
                                   "\nGrade: " + grade);
            } catch (NumberFormatException ex) {
                outputArea.setText("Error: Enter valid numeric marks.");
            }
        } else if (e.getSource() == clearBtn) {
            nameField.setText("");
            regField.setText("");
            m1Field.setText("");
            m2Field.setText("");
            m3Field.setText("");
            outputArea.setText("");
        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new StudentMarkList();
    }
}
