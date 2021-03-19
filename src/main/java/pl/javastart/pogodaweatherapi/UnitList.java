package pl.javastart.pogodaweatherapi;

public enum UnitList {
    IMPERIAL("Fahrenheit "),
    METRIC("Celsius"),
    DEFAULT("Kelvin");

    private final String description;

    UnitList(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getUriBySelection(String unit){
        return (unit.equals(UnitList.DEFAULT) ? "" : "units=" + unit.toLowerCase());
    }
}
