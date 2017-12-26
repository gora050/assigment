import API.OpenWeatherAPI;
import API.ParamsAPI;
import CityUtils.City;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenWeatherAPI m = new OpenWeatherAPI("da5e0e2c6a723df421c2f990a5d3c39b");
        System.out.println(m.RequestData(new ParamsAPI("Lviv")));
        City Lviv  = new City(m.RequestData(new ParamsAPI("Lviv")));
        System.out.println(Lviv.getWeather().getDetails());
        System.out.println(Lviv.getTemperature().Celsiuim());
        System.out.println(Lviv.getTemperature().Kelvin());
    }
}
