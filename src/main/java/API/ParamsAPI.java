package API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParamsAPI {
    private HashMap<String, String> paramsMap = new HashMap<String, String>();

    public HashMap<String, String> getParamsMap() {
        return paramsMap;
    }


    public ParamsAPI(String q) {
        paramsMap.put("q",q);
    }

    public ParamsAPI(Integer id) {
        paramsMap.put("id",id.toString());
    }

    public ParamsAPI(Integer lat, Integer lon) {
        paramsMap.put("lat",lat.toString());
        paramsMap.put("lon",lon.toString());

    }

    public ParamsAPI(String zip, String countryCode) {
        paramsMap.put("countryCode",countryCode);
        paramsMap.put("zip",zip);
    }

}
