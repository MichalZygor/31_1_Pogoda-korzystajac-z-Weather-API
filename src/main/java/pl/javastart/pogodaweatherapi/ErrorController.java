package pl.javastart.pogodaweatherapi;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(CityDataNotAvailableException.class)
    public String handlerException(){
        return "no-data";
    }
}
