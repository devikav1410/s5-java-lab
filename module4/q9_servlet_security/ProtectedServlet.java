import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProtectedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("login.html");
            return;
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Welcome, " + session.getAttribute("user") + "!</h2>");
        out.println("<p>This is a protected resource accessible only to logged-in users.</p>");
    }
}
