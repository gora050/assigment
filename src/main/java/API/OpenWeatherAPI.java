package API;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class OpenWeatherAPI {
    private final String baseURL = "http://api.openweathermap.org/data/2.5/weather";

    public String getBaseURL() {
        return baseURL;
    }

    public String getKey() {
        return key;
    }

    private String key;

    public OpenWeatherAPI(String key) {
        this.key = key;
    }

    public JsonObject RequestData(ParamsAPI g) throws Exception {
        JsonObject jobj = new Gson().fromJson(Request.Get(URLBuilder.generateQueryString(baseURL, key, g)),
                JsonObject.class);
        return jobj;
    }
}
