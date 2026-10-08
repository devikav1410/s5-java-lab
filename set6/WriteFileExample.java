import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileExample {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream(fileName, true)) {

            System.out.print("Enter text to write to the file: ");
            String userInput = scanner.nextLine();

            userInput += System.lineSeparator();

            byte[] bytes = userInput.getBytes();

            fos.write(bytes);
            System.out.println("Data successfully written to " + fileName);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
