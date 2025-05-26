// 25_HashMapExample.java
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student ID and name. Type -1 as ID to stop.");
        while (true) {
            System.out.print("Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if(id == -1) break;
            System.out.print("Student Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }
        
        System.out.print("Enter an ID to retrieve the student name: ");
        int searchId = scanner.nextInt();
        if(studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        scanner.close();
    }
}
