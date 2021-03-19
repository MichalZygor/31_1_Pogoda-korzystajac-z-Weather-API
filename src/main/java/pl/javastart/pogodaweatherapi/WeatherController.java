package pl.javastart.pogodaweatherapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {
    WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home(Model model) {
       // model.addAttribute("weatherData", weatherService.getCurrentData());
        return "home";
    }

    @PostMapping("/check-temp")
    public String chekTemp(Model model, @RequestParam(required = true, defaultValue = "Gliwice") String q,
                           @RequestParam(required = true, defaultValue = "pl") String lang,
                           @RequestParam(required = true, defaultValue = "metric") String unit) {
        model.addAttribute("weatherData", weatherService.getCurrentData(q, unit, lang));
        return "result";
    }
}
