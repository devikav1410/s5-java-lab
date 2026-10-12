import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Cookie[] cookies = req.getCookies();
        out.println("<h2>Stored Cookies</h2>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>" + c.getName() + " : " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies found.</p>");
        }
    }
}
