// 40_VirtualThreads.java
public class VirtualThreads {
    public static void main(String[] args) {
        // Requires Java 21+ for virtual threads
        final int threadCount = 100_000;
        for (int i = 0; i < threadCount; i++) {
            Thread.startVirtualThread(() -> {
                // Each thread prints a message (consider reducing output in practice)
                // For demonstration, we'll only count on some threads.
                if (Math.random() < 0.0001) {
                    System.out.println("Hello from virtual thread " + Thread.currentThread());
                }
            });
        }
        System.out.println(threadCount + " virtual threads launched.");
    }
}
