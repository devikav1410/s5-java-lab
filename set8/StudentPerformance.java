import java.awt.*;
import java.awt.event.*;

class StudentPerformance extends Frame implements ActionListener {
    TextField nameField, rollField, m1Field, m2Field, m3Field;
    Button calcBtn, clearBtn;
    TextArea output;

    public StudentPerformance() {
        setTitle("Student Performance System");
        setSize(500, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        
        add(new Label("Name:"));
        nameField = new TextField();
        add(nameField);

        add(new Label("Roll No:"));
        rollField = new TextField();
        add(rollField);

        
        add(new Label("Mark 1:"));
        m1Field = new TextField();
        add(m1Field);

        add(new Label("Mark 2:"));
        m2Field = new TextField();
        add(m2Field);

        add(new Label("Mark 3:"));
        m3Field = new TextField();
        add(m3Field);

        calcBtn = new Button("Calculate");
        clearBtn = new Button("Clear");
        add(calcBtn);
        add(clearBtn);

        add(new Label("Result:"));
        output = new TextArea();
        output.setEditable(false);
        add(output);

        
        calcBtn.addActionListener(this);
        clearBtn.addActionListener(this);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcBtn) {
            try {
                String name = nameField.getText();
                String roll = rollField.getText();
                double m1 = Double.parseDouble(m1Field.getText());
                double m2 = Double.parseDouble(m2Field.getText());
                double m3 = Double.parseDouble(m3Field.getText());

                double total = m1 + m2 + m3;
                double avg = total / 3.0;

                output.setText("Name: " + name + "\n" +
                               "Roll No: " + roll + "\n" +
                               "Total: " + total + "\n" +
                               "Average: " + avg);
            } catch (NumberFormatException ex) {
                output.setText("Error: Enter valid numeric marks.");
            }
        } else if (e.getSource() == clearBtn) {
            nameField.setText("");
            rollField.setText("");
            m1Field.setText("");
            m2Field.setText("");
            m3Field.setText("");
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentPerformance();
    }
}
