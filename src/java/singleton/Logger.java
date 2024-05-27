package src.java.singleton;

import java.time.Instant;
import java.util.Random;

import static java.lang.StringTemplate.STR;

public class Logger {
    private static Logger logger;
    private final String loggerName;


    private Logger() {
        loggerName = STR."Logger-\{new Random().nextInt(1000)}";
    }

    public void log(String message) {
        System.out.println(STR."[\{Thread.currentThread().getName()}::\{Instant.now()}::\{loggerName}] - \{message}");
    }

    public synchronized static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
