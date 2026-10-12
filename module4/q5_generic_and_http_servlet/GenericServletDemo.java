import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>GenericServlet: Protocol-independent servlet implementing service()</h3>");
    }
}
