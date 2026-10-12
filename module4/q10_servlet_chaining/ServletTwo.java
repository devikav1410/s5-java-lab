import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String source = (String) req.getAttribute("source");
        out.println("<h2>Servlet Chaining Demo</h2>");
        out.println("<p>Request processed by: " + source + " and completed by ServletTwo.</p>");
    }
}
