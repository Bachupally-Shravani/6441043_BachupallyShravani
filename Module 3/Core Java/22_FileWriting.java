// 22_FileWriting.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to write to output.txt: ");
        String userInput = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(userInput);
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
