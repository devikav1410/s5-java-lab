import java.sql.*;
import java.util.Scanner;

public class JDBCExceptionHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        try {
            Connection badCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrongdb", "root", "wrong");
        } catch (SQLException e) {
            System.out.println("1. Connection Error Handled: " + e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            try {
                stmt.executeQuery("SELECT * FORM students");
            } catch (SQLException e) {
                System.out.println("2. Invalid Query Error Handled: " + e.getMessage());
            }

            try {
                stmt.executeUpdate("INSERT INTO students VALUES (1, 'Alice', 20)");
            } catch (SQLException e) {
                System.out.println("3. Duplicate Record Error Handled: " + e.getMessage());
            }

            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a numeric Student ID: ");
            int id = sc.nextInt();
            System.out.println("Valid ID received: " + id);
            sc.close();
        } catch (Exception e) {
            System.out.println("4. Invalid Input Error Handled: " + e.toString());
        }
    }
}
