import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        Student student = new Student(101, "Alice");
        request.setAttribute("student", student);
        request.getRequestDispatcher("student_view.jsp").forward(request, response);
    }
}
