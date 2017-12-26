package WeatherUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemperature {
    @Test
    public void TestTemp1() {
        assertEquals(new Temperature(7.0, 14.0, -10.0, 50, 1800).Celsiuim(), -266.0,0.00001);
    }
    @Test
    public void TestTemp2() {
        assertEquals(new Temperature(7.0, 14.0, -10.0, 50, 1800).Kelvin(), 7.0,0.00001);
    }

}
