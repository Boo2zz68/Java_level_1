package Java_Core_6;

import Java_Core_6.Enums.Periods;

import java.io.IOException;

public interface WeatherProvider {
    public void getWeather(Periods period) throws IOException;
}
