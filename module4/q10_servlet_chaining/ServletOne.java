import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        req.setAttribute("source", "ServletOne");
        RequestDispatcher rd = req.getRequestDispatcher("ServletTwo");
        rd.forward(req, res);
    }
}
