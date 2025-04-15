package creational.singleton;

public class Logger {

    // Static variable to hold the single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code here
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
