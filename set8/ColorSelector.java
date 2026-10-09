import java.awt.*;
import java.awt.event.*;

class ColorSelector extends Frame implements ActionListener {
    Button redBtn, greenBtn, blueBtn;
    Panel panel;

    public ColorSelector() {
        setTitle("Color Selection App");
        setSize(400, 200);
        setLayout(new BorderLayout());

        panel = new Panel();
        panel.setBackground(Color.white);
        add(panel, BorderLayout.CENTER);

        Panel buttonPanel = new Panel();
        redBtn = new Button("Red");
        greenBtn = new Button("Green");
        blueBtn = new Button("Blue");

        buttonPanel.add(redBtn);
        buttonPanel.add(greenBtn);
        buttonPanel.add(blueBtn);

        add(buttonPanel, BorderLayout.SOUTH);

        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource(); // Event Source
        if (src == redBtn) {
            panel.setBackground(Color.red);
        } else if (src == greenBtn) {
            panel.setBackground(Color.green);
        } else if (src == blueBtn) {
            panel.setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new ColorSelector();
    }
}
