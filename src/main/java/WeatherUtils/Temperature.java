package WeatherUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Temperature {
    private double value;
    private double temp_min;
    private double temp_max;
    private int humidity;
    private int presure;

    private static double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }

    public double Celsiuim() {
        return round(value - 273);
    }

    public double Kelvin() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Temperature(JsonObject params) {
        this(
                params.get("temp").getAsDouble(),
                params.get("temp_min").getAsDouble(),
                params.get("temp_max").getAsDouble(),
                params.get("humidity").getAsInt(),
                params.get("pressure").getAsInt()
        );
    }

    public Temperature(double value, double temp_min, double temp_max, int humidity, int presure) {
        this.value = value;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.humidity = humidity;
        this.presure = presure;
    }

    public JsonObject toJson() {
        JsonObject temperature = new JsonObject();
        temperature.add("kelvin", new JsonPrimitive(this.Kelvin()));
        temperature.add("celsium", new JsonPrimitive(this.Celsiuim()));
        return temperature;
    }
}
