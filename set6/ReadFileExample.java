import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            
            System.out.println("--- File Contents ---");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println("\n---------------------");
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
