package pl.javastart.pogodaweatherapi;

public enum UnitList {
    METRIC("Celsius"),
    IMPERIAL("Fahrenheit "),
    DEFAULT("Kelvin");

    private final String description;

    UnitList(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
