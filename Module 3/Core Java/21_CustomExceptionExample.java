// 21_CustomExceptionExample.java
import java.util.Scanner;

// Define custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            if(age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            }
            System.out.println("Valid age: " + age);
        } catch(InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
        scanner.close();
    }
}
