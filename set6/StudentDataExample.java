import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataExample {
    public static void main(String[] args) {
        String fileName = "student.dat";

        int writeRollNumber = 101;
        String writeName = "sam";
        double writeMarks = 94.5;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(writeRollNumber);
            dos.writeUTF(writeName);
            dos.writeDouble(writeMarks);
            System.out.println("Student details saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }

        System.out.println("\nReading data from file...");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int readRollNumber = dis.readInt();
            String readName = dis.readUTF();
            double readMarks = dis.readDouble();

            System.out.println("--- Student Details ---");
            System.out.println("Roll Number: " + readRollNumber);
            System.out.println("Name:        " + readName);
            System.out.println("Marks:       " + readMarks);
            System.out.println("------------------------");
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
    }
}
