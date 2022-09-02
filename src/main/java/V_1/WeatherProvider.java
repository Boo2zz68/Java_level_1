package V_1;

import V_1.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {
    public void getWeather(Periods period) throws IOException;
}
