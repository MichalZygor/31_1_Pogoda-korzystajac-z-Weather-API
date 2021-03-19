package pl.javastart.pogodaweatherapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.javastart.pogodaweatherapi.dto.WeatherResponseDto;

@Service
public class WeatherService {
    //http://api.openweathermap.org/data/2.5/weather?appid=d52e944aa373c1fa73e7d70e3afb006d
    private static final String APP_ID = "d52e944aa373c1fa73e7d70e3afb006d";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?appid=" + APP_ID;
    private UnitList unitList;
    private Language language;


    public WeatherResponseDto getCurrentData(String cityName, String unit, String lang) {
//        Weather weather = new Weather();

        RestTemplate restTemplate = new RestTemplate();

        try {
            WeatherResponseDto response = restTemplate.getForObject(BASE_URL
                    + "&q=" + cityName
                    + "&lang="+ lang
                    + "&units=" + unit, WeatherResponseDto.class);
            return response;
        } catch (Exception e) {
            throw new CityDataNotAvailableException();
        }
    }
}
