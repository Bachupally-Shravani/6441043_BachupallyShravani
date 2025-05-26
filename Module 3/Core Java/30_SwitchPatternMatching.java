// 30_SwitchPatternMatching.java
public class SwitchPatternMatching {
    public static void checkType(Object obj) {
        // Requires Java 21+ for advanced pattern matching in switch expressions.
        switch (obj) {
            case Integer i -> System.out.println("Integer with value " + i);
            case String s -> System.out.println("String with value " + s);
            case Double d -> System.out.println("Double with value " + d);
            default -> System.out.println("Other type");
        }
    }
    
    public static void main(String[] args) {
        checkType(100);
        checkType("Hello");
        checkType(45.67);
        checkType(true);
    }
}
