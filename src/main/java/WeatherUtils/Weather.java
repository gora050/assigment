package WeatherUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Weather {
    private String main;
    private String details;

    public Weather(JsonObject params) {
        this(params.get("main").getAsString(), params.get("description").getAsString());
    }

    public Weather(String main, String details) {
        this.main = main;
        this.details = details;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public JsonObject toJson() {
        JsonObject coords = new JsonObject();
        coords.add("main", new JsonPrimitive(this.main));
        coords.add("details", new JsonPrimitive(this.details));
        return coords;
    }
}
