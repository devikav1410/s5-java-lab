import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetPostHeadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>GET Request: Parameters exposed in URL query string</h3>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>POST Request: Parameters sent securely in HTTP request body</h3>");
    }

    protected void doHead(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        res.setHeader("Custom-Info", "HEAD request returns headers only without body");
    }
}
