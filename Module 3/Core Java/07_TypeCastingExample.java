// 07_TypeCastingExample.java
public class TypeCastingExample {
    public static void main(String[] args) {
        // Double to int
        double decimalValue = 9.78;
        int intValue = (int) decimalValue;
        System.out.println("Double value: " + decimalValue + " cast to int: " + intValue);
        
        // Int to double
        int num = 50;
        double newDouble = (double) num;
        System.out.println("Int value: " + num + " cast to double: " + newDouble);
    }
}
