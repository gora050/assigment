package API;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestParamsApi {
    @Test
    public void TestConstructor1() {
        ParamsAPI a = new ParamsAPI(1);
        assertEquals(a.getParamsMap().get("id"), "1");
    }
    @Test
    public void TestConstructor2() {
        ParamsAPI a = new ParamsAPI("test");
        assertEquals(a.getParamsMap().get("q"), "test");
    }
    @Test
    public void TestConstructor3() {
        ParamsAPI a = new ParamsAPI(15,24);
        assertEquals(a.getParamsMap().get("lat"), "15");
        assertEquals(a.getParamsMap().get("lon"), "24");
    }
    @Test
    public void TestConstructor4() {
        ParamsAPI a = new ParamsAPI("03087","ua");
        assertEquals(a.getParamsMap().get("zip"), "03087");
        assertEquals(a.getParamsMap().get("countryCode"), "ua");
    }
}
