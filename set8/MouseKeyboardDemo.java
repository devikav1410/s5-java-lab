import java.awt.*;
import java.awt.event.*;

class MouseKeyboardDemo extends Frame {
    Label info;

    public MouseKeyboardDemo() {
        setTitle("Mouse & Keyboard Events");
        setSize(500, 300);
        setLayout(new FlowLayout());

        info = new Label("Move mouse or press keys...");
        add(info);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                info.setText("Mouse moved at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                info.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                info.setText("Key pressed: " + e.getKeyChar());
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseKeyboardDemo();
    }
}
