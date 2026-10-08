import java.applet.Applet;
import java.awt.Graphics;

public class SimpleAnimationApplet extends Applet implements Runnable {
    int x;              // Circle position
    Thread t;           // Animation thread
    boolean running;    // Control flag

    public void init() {
        x = 10;         // Initial position
    }

    public void start() {
        running = true;
        t = new Thread(this);
        t.start();
    }

    public void stop() {
        running = false;
        t = null;
    }

    public void run() {
        while (running) {
            x += 5;     // Move circle
            if (x > getWidth()) {
                x = 0;  // Reset to left
            }
            repaint();
            try {
                Thread.sleep(100); // Delay
            } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 50, 30, 30); // Draw circle
    }
}
