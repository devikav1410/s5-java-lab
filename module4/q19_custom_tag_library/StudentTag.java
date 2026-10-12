import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class StudentTag extends SimpleTagSupport {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.print("<div style='border:1px solid black; padding:8px; margin:4px;'>");
        out.print("<b>Student Card:</b> ID = " + id + ", Name = " + name);
        out.print("</div>");
    }
}
