package CityUtils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCoordinates {
    @Test
    public void generateQueryStringTest() {
        assertEquals(new Coordinates(10, 15).getLat(), 10,0.0001);
    }
}
