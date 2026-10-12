import java.io.*;
import java.sql.*;

public class BlobClobDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "jdbcuser";
        String password = "jdbcpass";

        Connection con = DriverManager.getConnection(url, user, password);

        File img = new File("sample.jpg");
        if (!img.exists()) {
            new FileOutputStream(img).write(new byte[]{10, 20, 30, 40});
        }
        File doc = new File("sample.txt");
        if (!doc.exists()) {
            FileWriter fw = new FileWriter(doc);
            fw.write("This is large document text stored as CLOB.");
            fw.close();
        }

        String insertSql = "INSERT INTO files_data (id, image_data, document_data) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(insertSql);
        ps.setInt(1, 1);
        ps.setBinaryStream(2, new FileInputStream(img));
        ps.setCharacterStream(3, new FileReader(doc));
        ps.executeUpdate();
        System.out.println("BLOB and CLOB inserted successfully!");

        ResultSet rs = con.createStatement().executeQuery("SELECT image_data, document_data FROM files_data WHERE id = 1");
        if (rs.next()) {
            InputStream is = rs.getBinaryStream("image_data");
            FileOutputStream fos = new FileOutputStream("retrieved.jpg");
            fos.write(is.readAllBytes());
            fos.close();
            System.out.println("BLOB retrieved and saved as retrieved.jpg");

            Reader r = rs.getCharacterStream("document_data");
            BufferedReader br = new BufferedReader(r);
            System.out.println("CLOB Content: " + br.readLine());
        }

        ps.close();
        con.close();
    }
}
