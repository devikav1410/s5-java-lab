import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init() method executed");
    }

    protected void service(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        System.out.println("service() method executed");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h3>Servlet Life Cycle: service() method executed</h3>");
    }

    public void destroy() {
        System.out.println("destroy() method executed");
    }
}
