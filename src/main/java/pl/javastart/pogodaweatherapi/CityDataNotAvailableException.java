package pl.javastart.pogodaweatherapi;

public class CityDataNotAvailableException extends RuntimeException {
    public CityDataNotAvailableException() {
        super("Nie udało się pobrać danych dla miasta");
    }
}
