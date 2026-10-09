import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(
            url, user, password
        );

        System.out.println("Database connected successfully!");

        con.close();
    }
}
