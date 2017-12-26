package CityUtils;

import WeatherUtils.Temperature;
import WeatherUtils.Weather;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class City {
    private String title;
    private Weather weather;
    private Temperature temperature;
    private Coordinates coords;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public City(JsonObject params) {
        this(
                params.get("name").getAsString(),
                new Weather(params.get("weather").getAsJsonArray().get(0).getAsJsonObject()),
                new Temperature(params.get("main").getAsJsonObject()),
                new Coordinates(params.get("coord").getAsJsonObject()));
    }

    public City(String title, Weather weather, Temperature temperature, Coordinates coords) {
        this.title = title;
        this.weather = weather;
        this.temperature = temperature;
        this.coords = coords;
    }

    public JsonObject toJson() {
        JsonObject res = new JsonObject();
        res.add("title", new JsonPrimitive(this.title));
        res.add("weather", this.weather.toJson());
        res.add("temperature", this.temperature.toJson());
        res.add("coords", this.coords.toJson());
        return res;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}