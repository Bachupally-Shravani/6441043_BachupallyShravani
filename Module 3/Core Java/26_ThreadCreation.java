// 26_ThreadCreation.java
class MessageThread implements Runnable {
    private String message;
    
    public MessageThread(String message) {
        this.message = message;
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessageThread("Hello from Thread 1"));
        Thread thread2 = new Thread(new MessageThread("Hello from Thread 2"));
        
        thread1.start();
        thread2.start();
    }
}
