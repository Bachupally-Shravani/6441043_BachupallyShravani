// 27_LambdaExpression.java
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
        
        // Sorting using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));
        
        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}
