import java.sql.*;
import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";       // replace with your MySQL username
        String password = "yourpassword"; // replace with your MySQL password

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Student ID:");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.println("Enter Student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Student Age:");
            int age = sc.nextInt();

            String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setInt(1, id);
            insertStmt.setString(2, name);
            insertStmt.setInt(3, age);

            int rows = insertStmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student record inserted successfully!");
            }

            System.out.println("Enter Student ID to search:");
            int searchId = sc.nextInt();

            String searchQuery = "SELECT * FROM students WHERE id = ?";
            PreparedStatement searchStmt = conn.prepareStatement(searchQuery);
            searchStmt.setInt(1, searchId);

            ResultSet rs = searchStmt.executeQuery();
            if (rs.next()) {
                System.out.println("Student Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
            } else {
                System.out.println("No student found with ID " + searchId);
            }

            insertStmt.close();
            searchStmt.close();
            conn.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
