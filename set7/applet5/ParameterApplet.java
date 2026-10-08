import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ParameterApplet extends Applet {
    String message;
    Color bgColor, fgColor;

    public void init() {
        message = getParameter("message");

        String bg = getParameter("bgcolor");
        String fg = getParameter("fgcolor");
        if (bg != null) {
            bgColor = Color.decode(bg);
        } else {
            bgColor = Color.white;
        }

        if (fg != null) {
            fgColor = Color.decode(fg);
        } else {
            fgColor = Color.black;
        }

        setBackground(bgColor);
        setForeground(fgColor);
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}
