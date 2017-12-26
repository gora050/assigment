package CityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Coordinates {
    private final double lat;
    private final double lon;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public Coordinates(JsonObject params) {
        this(params.get("lat").getAsDouble(), params.get("lon").getAsDouble());
    }

    public Coordinates(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public JsonObject toJson() {
        JsonObject coords = new JsonObject();
        coords.add("lat", new JsonPrimitive(this.lat));
        coords.add("lon", new JsonPrimitive(this.lon));
        return coords;
    }
}
