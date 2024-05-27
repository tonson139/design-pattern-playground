package src.java.singleton;

public class Client {
    public static void execute() {
        // using 2 thread to create 2 logger instance
        Thread thread1 = new Thread(() -> {
            var log1 = Logger.getLogger();
            log1.log("Thread 1");
        });
        Thread thread2 = new Thread(() -> {
            var log1 = Logger.getLogger();
            log1.log("Thread 2");
            for(int i = 0; i < 10; i++) {
                var log2 = Logger.getLogger();
                log2.log(STR."Thread 2 - \{i}");
            }
        });
        thread1.start();
        thread2.start();
    }
}
