package pl.javastart.pogodaweatherapi.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Data
public class WeatherMainDto {
    private Double temp;
}
