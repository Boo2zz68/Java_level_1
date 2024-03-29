package Java_Core_6;

import Java_Core_6.Enums.Functionality;
import Java_Core_6.Enums.Periods;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import Java_Core_6.DatabaseRepository;
import Java_Core_6.DatabaseRepositorySQLiteImpl;
import Java_Core_6.WeatherProvider;
import Java_Core_6.AccuWeatherProvider;
public class Controller {
    WeatherProvider weatherProvider = new AccuWeatherProvider();
    DatabaseRepository repository = new DatabaseRepositorySQLiteImpl();

    Map<Integer, Functionality> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, Functionality.GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
        variantResult.put(3, Functionality.GET_DATA_BASE);
        variantResult.put(4, Functionality.EXIT);
    }

    public void onUserInput(String input) throws IOException, SQLException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
            case GET_DATA_BASE:
                getWeatherFromDB();
                break;
            case EXIT:
                exitApp();
                break;
        }
    }

    public void getCurrentWeather() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.NOW);
    }

    public void getWeatherIn5Days() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.FIVE_DAYS);
    }

    public void getWeatherFromDB() throws IOException, SQLException {
        weatherProvider.getWeather(Periods.BASE);
    }

    public void exitApp() throws IOException, SQLException {
        System.out.println("Завершаю работу");
        repository.closeConnection();
        System.exit(4);
    }
}
