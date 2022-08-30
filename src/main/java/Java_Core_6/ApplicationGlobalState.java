package Java_Core_6;

public final class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "B48vo4cA4QMcrWxTOw4CQdJR0I9txQtn";
    private final String DB_FILENAME = "application.db";

    public String getDB_FILENAME() {
        return DB_FILENAME;
    }

    private ApplicationGlobalState() {
    }
    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }
        return INSTANCE;
    }
    public String getSelectedCity() {
        return selectedCity;
    }
    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
    public String getApiKey() {
        return this.API_KEY;
    }
    public String getDbFileName() {
        return DB_FILENAME;
    }
}

