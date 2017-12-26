package WeatherUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWeather {

    @Test
    public void TestTemp1() {
        assertEquals(new Weather("sunny", "very-very sunny").getDetails(), "very-very sunny" );
    }

}

