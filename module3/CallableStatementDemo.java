import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(url, user, password);

        CallableStatement cs = con.prepareCall("{CALL getStudentDetails(?, ?, ?)}");
        cs.setInt(1, 1);
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.registerOutParameter(3, Types.INTEGER);

        cs.execute();

        System.out.println("Student Name: " + cs.getString(2));
        System.out.println("Student Age : " + cs.getInt(3));

        cs.close();
        con.close();
    }
}
