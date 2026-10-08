import java.applet.Applet;
import java.awt.Graphics;

public class  AppletLifeCycleDemoextends Applet {

    public void init() {
        System.out.println("init() method executed");
    }

    public void start() {
        System.out.println("start() method executed");
    }

    public void paint(Graphics g) {
        System.out.println("paint() method executed");
        g.drawString("Applet Life Cycle Demo", 20, 20);
    }

    public void stop() {
        System.out.println("stop() method executed");
    }

    public void destroy() {
        System.out.println("destroy() method executed");
    }
}
