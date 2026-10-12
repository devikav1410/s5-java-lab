import java.sql.*;

public class BankTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE account_no = 101");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 1000 WHERE account_no = 102");

            con.commit();
            System.out.println("Transfer successful! Changes committed.");

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("Transfer failed! Changes rolled back.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
