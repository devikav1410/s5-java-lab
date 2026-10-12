import java.sql.*;

public class ResultSetNavigation {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        rs.first();
        System.out.println("First Record: " + rs.getInt("id") + " " + rs.getString("name"));

        rs.next();
        System.out.println("Next Record : " + rs.getInt("id") + " " + rs.getString("name"));

        rs.previous();
        System.out.println("Previous Record: " + rs.getInt("id") + " " + rs.getString("name"));

        rs.last();
        System.out.println("Last Record : " + rs.getInt("id") + " " + rs.getString("name"));

        rs.absolute(2);
        System.out.println("Row 2 (absolute): " + rs.getInt("id") + " " + rs.getString("name"));

        rs.close();
        stmt.close();
        con.close();
    }
}
