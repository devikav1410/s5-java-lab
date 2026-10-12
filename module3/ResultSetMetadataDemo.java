import java.sql.*;

public class ResultSetMetadataDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();

        System.out.println("Total Columns: " + count);

        for (int i = 1; i <= count; i++) {
            System.out.println("Column " + i + ": " + rsmd.getColumnName(i) +
                               " | Data Type: " + rsmd.getColumnTypeName(i) +
                               " | Display Size: " + rsmd.getColumnDisplaySize(i) +
                               " | Nullable: " + (rsmd.isNullable(i) == ResultSetMetaData.columnNullable));
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
