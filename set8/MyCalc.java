import java.awt.*;
import java.awt.event.*;

class MyCalc extends Frame implements ActionListener {

    TextField f1, f2, res;
    Button bAdd, bSub, bMul, bDiv;

    public MyCalc() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        f1 = new TextField();
        add(f1);

        add(new Label("Second Number:"));
        f2 = new TextField();
        add(f2);

        bAdd = new Button("+");
        bSub = new Button("-");
        bMul = new Button("*");
        bDiv = new Button("/");

        add(bAdd);
        add(bSub);
        add(bMul);
        add(bDiv);

        add(new Label("Result:"));
        res = new TextField();
        res.setEditable(false);
        add(res);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(f1.getText());
            double b = Double.parseDouble(f2.getText());
            double r = 0;

            if (e.getSource() == bAdd) {
                r = a + b;
            } else if (e.getSource() == bSub) {
                r = a - b;
            } else if (e.getSource() == bMul) {
                r = a * b;
            } else if (e.getSource() == bDiv) {
                if (b == 0) {
                    res.setText("Cannot divide by zero");
                    return;
                }
                r = a / b;
            }

            res.setText(String.valueOf(r));
        } catch (NumberFormatException ex) {
            res.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}
