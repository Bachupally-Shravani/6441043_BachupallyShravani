// 20_TryCatchExample.java
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int num2 = scanner.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
