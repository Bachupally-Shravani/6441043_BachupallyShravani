// 29_RecordExample.java
import java.util.Arrays;
import java.util.List;

public class RecordExample {
    // Requires Java 16+
    public record Person(String name, int age) {}
    
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        System.out.println(person1);
        System.out.println(person2);
        
        List<Person> people = Arrays.asList(
            new Person("Charlie", 35),
            new Person("Diana", 28),
            new Person("Evan", 40)
        );
        
        // Filter based on age (>30)
        people.stream()
              .filter(p -> p.age() > 30)
              .forEach(System.out::println);
    }
}
