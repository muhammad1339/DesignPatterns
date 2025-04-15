package creational.singleton;

public class MoSingleton {

    private static MoSingleton instance;

    private MoSingleton() {
        // Private constructor to prevent instantiation
    }

    public static MoSingleton getInstance() {
        if (instance == null) {
            instance = new MoSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from MoSingleton!");
    }

}
