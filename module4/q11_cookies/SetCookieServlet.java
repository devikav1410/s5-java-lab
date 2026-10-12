import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        String name = req.getParameter("username");
        if (name == null) name = "Alice";

        Cookie cookie = new Cookie("username", name);
        res.addCookie(cookie);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Cookie Set: username = " + name + "</h3>");
        out.println("<a href='GetCookieServlet'>View Cookie in Next Request</a>");
    }
}
