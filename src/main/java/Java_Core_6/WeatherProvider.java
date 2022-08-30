package Java_Core_6;

import Java_Core_6.Entity.WeatherData;
import Java_Core_6.Enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {
    public void getWeather(Periods period) throws IOException, SQLException;
    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
