package CityUtils;

import API.ParamsAPI;
import API.URLBuilder;
import WeatherUtils.Temperature;
import WeatherUtils.Weather;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.json.simple.JSONObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCity {
    @Test
    public void TestConstructor1() {
        String name = "Sokal";
        Weather weather = new Weather("sunny", "very-very sunny");
        Temperature temp =  new Temperature(7.0, 14.0, -10.0, 50, 1800);
        Coordinates coords = new Coordinates(50.4873528, 24.2799195);
        City city = new City(
                name,
                weather,
                temp,
                coords);
        JsonObject res = new JsonObject();
        res.add("title", new JsonPrimitive(name));
        res.add("weather", weather.toJson());
        res.add("temperature", temp.toJson());
        res.add("coords", coords.toJson());
        assertEquals(city.toJson(), res);

    }

}

