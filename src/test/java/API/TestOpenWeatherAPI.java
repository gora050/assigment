package API;

import com.google.api.client.json.Json;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOpenWeatherAPI {
    @Test
    public void TestKey1() {
        OpenWeatherAPI a = new OpenWeatherAPI("somekey");
        assertEquals(a.getKey(), "somekey");
    }

    @Test
    public void TestUrl1() {
        OpenWeatherAPI a = new OpenWeatherAPI("somekey");
        assertEquals(a.getBaseURL(), "http://api.openweathermap.org/data/2.5/weather");
    }
}
