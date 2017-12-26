package API;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestURLBuilder {
    @Test
    public void generateQueryStringTest() {
        assertEquals(URLBuilder.generateQueryString("http://api.openweathermap.org/data/2.5/weather","5",new ParamsAPI(1)), "http://api.openweathermap.org/data/2.5/weather?id=1&appid=5");
    }
}
