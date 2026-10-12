import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentCRUDController extends HttpServlet {
    private String url = "jdbc:mysql://localhost:3306/studentdb";
    private String user = "jdbcuser";
    private String pass = "jdbcpass";

    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        String action = req.getParameter("action");
        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            if ("add".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                PreparedStatement ps = con.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.executeUpdate();
                ps.close();
            } else if ("update".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                PreparedStatement ps = con.prepareStatement("UPDATE students SET name=? WHERE id=?");
                ps.setString(1, name);
                ps.setInt(2, id);
                ps.executeUpdate();
                ps.close();
            } else if ("delete".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id=?");
                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();
            }

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            ArrayList<Student> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Student(rs.getInt("id"), rs.getString("name")));
            }
            rs.close();
            stmt.close();
            con.close();

            req.setAttribute("students", list);
            req.getRequestDispatcher("student_crud.jsp").forward(req, res);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
