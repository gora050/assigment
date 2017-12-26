package API;

import API.ParamsAPI;

public class URLBuilder {
    public static String generateQueryString(String baseURL, String apikey, ParamsAPI params) {
        String result = "?";
        for (String key : params.getParamsMap().keySet()) {
            result = result.concat(key.concat("=".concat(params.getParamsMap().get(key))));
        }
        return baseURL.concat(result).concat("&appid=").concat(apikey);
    }
}
