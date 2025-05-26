// 41_ExecutorServiceCallable.java
import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;

public class ExecutorServiceCallable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> tasks = new ArrayList<>();
        
        // Create 5 simple callable tasks
        for (int i = 1; i <= 5; i++) {
            final int num = i;
            tasks.add(() -> {
                // Simulate some processing
                Thread.sleep(500);
                return num * num;
            });
        }
        
        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);
            for (Future<Integer> future : results) {
                System.out.println("Result: " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error executing tasks: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
