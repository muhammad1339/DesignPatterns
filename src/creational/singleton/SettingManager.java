package creational.singleton;

public class SettingManager {
    // Static variable to hold the single instance of SettingManager
    private static SettingManager instance;
    // theme
    private String theme;
    // language
    private String language;
    // fontSize
    private int fontSize;

    // Private constructor to prevent instantiation
    private SettingManager() {
        // Initialization code here
    }

    // Public method to provide access to the instance
    public static SettingManager getInstance() {
        if (instance == null) {
            instance = new SettingManager();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showSettings() {
        System.out.println("Showing settings...");
    }

    // Getters and Setters for theme, language, and fontSize
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
    // Example method to demonstrate functionality

    public void applySettings() {
        System.out.println("Applying settings...");
        System.out.println("Theme: " + theme);
        System.out.println("Language: " + language);
        System.out.println("Font Size: " + fontSize);
    }
}
