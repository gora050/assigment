package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Request {


    public static String Get(String url) throws Exception {
        URL oracle =  new URL(url);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String res = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            res += inputLine;
        in.close();
        return res;
    }


}
