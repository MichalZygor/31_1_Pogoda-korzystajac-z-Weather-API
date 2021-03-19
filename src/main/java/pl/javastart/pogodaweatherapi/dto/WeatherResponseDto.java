package pl.javastart.pogodaweatherapi.dto;

import lombok.Data;

@Data
public class WeatherResponseDto {
    private String cod;
    private String name;
    private WeatherMainDto main;
    //private WeatherDto weather;
}