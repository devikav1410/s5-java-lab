import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventApplet extends Applet implements MouseListener {
    String message = "Move the mouse inside the applet";
    int x = 20, y = 20;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        message = "Mouse clicked at (" + x + ", " + y + ")";
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
