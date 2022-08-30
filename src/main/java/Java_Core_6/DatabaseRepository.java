package Java_Core_6;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import Java_Core_6.Entity.WeatherData;
public interface DatabaseRepository {
    boolean saveWeatherData(WeatherData weatherData) throws SQLException;
    List<WeatherData> getAllSavedData() throws IOException, SQLException;
    void closeConnection();
}
