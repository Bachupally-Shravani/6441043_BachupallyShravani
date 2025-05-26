// 10_NumberGuessingGame.java
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        
        System.out.println("Guess the number (between 1 and 100):");
        while (guess != target) {
            guess = scanner.nextInt();
            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it!");
            }
        }
        scanner.close();
    }
}
