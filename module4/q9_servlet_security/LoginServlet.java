import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        String u = req.getParameter("username");
        String p = req.getParameter("password");

        if ("admin".equals(u) && "1234".equals(p)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", u);
            res.sendRedirect("ProtectedServlet");
        } else {
            res.getWriter().println("Invalid Credentials! <a href='login.html'>Try Again</a>");
        }
    }
}
