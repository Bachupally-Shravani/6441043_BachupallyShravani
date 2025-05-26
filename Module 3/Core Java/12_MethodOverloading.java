// 12_MethodOverloading.java
public class MethodOverloading {
    
    // Two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(5, 10));
        System.out.println("add(double, double): " + add(5.5, 10.5));
        System.out.println("add(int, int, int): " + add(5, 10, 15));
    }
}
