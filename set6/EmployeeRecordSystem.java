import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeRecordSystem {
    public static void main(String[] args) {
        String fileName = "employees.dat";

        try (Scanner scanner = new Scanner(System.in);
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            System.out.print("How many employees do you want to add? ");
            int count = scanner.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.println("\nEnter details for Employee #" + (i + 1) + ":");
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();

                dos.writeInt(id);
                dos.writeUTF(name);
                dos.writeDouble(salary);
            }
            System.out.println("\nAll employee records saved to " + fileName);

        } catch (IOException e) {
            System.err.println("Error saving records: " + e.getMessage());
        }

        System.out.println("\n--- Displaying Stored Employee Records ---");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (true) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double salary = dis.readDouble();

                System.out.println("ID: " + id + " | Name: " + name + " | Salary: $" + salary);
            }
        } catch (EOFException e) {
            System.out.println("------------------------------------------");
            System.out.println("End of file reached. All records read successfully.");
        } catch (IOException e) {
            System.err.println("Error reading records: " + e.getMessage());
        }
    }
}
