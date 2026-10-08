import java.applet.Applet;
import java.awt.Graphics;

public class StudentInfoApplet extends Applet {
    String name, regNo, course, semester;

    public void init() {
        name = getParameter("name");
        regNo = getParameter("regNo");
        course = getParameter("course");
        semester = getParameter("semester");
    }

    public void paint(Graphics g) {
        g.drawString("Student Information:", 20, 20);
        g.drawString("Name: " + name, 20, 40);
        g.drawString("Register Number: " + regNo, 20, 60);
        g.drawString("Course: " + course, 20, 80);
        g.drawString("Semester: " + semester, 20, 100);
    }
}
