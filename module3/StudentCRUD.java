
import java.sql.*;

public class StudentCRUD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";       
        String password = "jdbcpass"; 

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

           
            String insertQuery = "INSERT INTO students VALUES (1, 'Alice', 20)";
            stmt.executeUpdate(insertQuery);
            System.out.println("Record Inserted!");

           
            String updateQuery = "UPDATE students SET age=21 WHERE id=1";
            stmt.executeUpdate(updateQuery);
            System.out.println("Record Updated!");

            
            String selectQuery = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getInt("age"));
            }

           
            String deleteQuery = "DELETE FROM students WHERE id=1";
            stmt.executeUpdate(deleteQuery);
            System.out.println("Record Deleted!");

            
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
