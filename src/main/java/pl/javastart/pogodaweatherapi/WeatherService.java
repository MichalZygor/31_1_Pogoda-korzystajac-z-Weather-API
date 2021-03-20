package pl.javastart.pogodaweatherapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.javastart.pogodaweatherapi.dto.WeatherResponseDto;

@Service
public class WeatherService {
    private static final String APP_ID = "d52e944aa373c1fa73e7d70e3afb006d";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?appid=" + APP_ID;

    public WeatherResponseDto getCurrentData(String cityName, String unit, String lang) {
        RestTemplate restTemplate = new RestTemplate();
        unit =  (unit.equals(UnitList.DEFAULT.name()) ? "" : "&units=" + unit );

        try {
            WeatherResponseDto response = restTemplate.getForObject(BASE_URL
                    + "&q=" + cityName
                    + "&lang="+ lang
                    + unit , WeatherResponseDto.class);
            return response;
        } catch (Exception e) {
            throw new CityDataNotAvailableException();
        }
    }
}
