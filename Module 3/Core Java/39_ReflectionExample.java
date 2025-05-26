// 39_ReflectionExample.java
import java.lang.reflect.Method;

public class ReflectionExample {
    public void sampleMethod(String param) {
        System.out.println("Method invoked with parameter: " + param);
    }
    
    public static void main(String[] args) {
        try {
            Class<?> clazz = ReflectionExample.class;
            Object instance = clazz.getDeclaredConstructor().newInstance();
            
            Method method = clazz.getDeclaredMethod("sampleMethod", String.class);
            System.out.println("Method Name: " + method.getName());
            System.out.println("Parameter Types: ");
            for(Class<?> paramType : method.getParameterTypes()){
                System.out.println(" " + paramType.getName());
            }
            // Invoke the method
            method.invoke(instance, "Reflection Example");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
