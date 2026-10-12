import java.sql.*;

public class DatabaseMetadataDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(url, user, password);
        DatabaseMetaData dbmd = con.getMetaData();

        System.out.println("Database Name    : " + dbmd.getDatabaseProductName());
        System.out.println("Database Version : " + dbmd.getDatabaseProductVersion());
        System.out.println("Driver Name      : " + dbmd.getDriverName());
        System.out.println("Driver Version   : " + dbmd.getDriverVersion());

        System.out.println("Supports Transactions : " + dbmd.supportsTransactions());
        System.out.println("Supports Batch Updates: " + dbmd.supportsBatchUpdates());

        System.out.println("\nAvailable Tables:");
        ResultSet rs = dbmd.getTables(null, null, "%", new String[]{"TABLE"});
        while (rs.next()) {
            System.out.println("- " + rs.getString("TABLE_NAME"));
        }

        con.close();
    }
}
