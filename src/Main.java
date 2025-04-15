import creational.singleton.Logger;
import creational.singleton.MoSingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a new instance of MoSingleton
        MoSingleton singleton = MoSingleton.getInstance();
        MoSingleton singletonCopy = MoSingleton.getInstance();

        // Check if both instances are the same
        if (singleton == singletonCopy) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
        // Call the showMessage method
        singleton.showMessage();

        // Call the log method
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");
    }
}