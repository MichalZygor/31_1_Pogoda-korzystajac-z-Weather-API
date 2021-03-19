package pl.javastart.pogodaweatherapi;

enum Language {
    PL("Polish - PL"),
    EN("English - EN"),
    AF("Afrikaans - AF"),
    AL("Albanian - AL"),
    AR("Arabic - AR"),
    AZ("Azerbaijani - AZ"),
    BG("Bulgarian - BG"),
    CA("Catalan - CA"),
    CZ("Czech - CZ"),
    DA("Danish - DA"),
    DE("German - DE"),
    EL("Greek - EL"),
    EU("Basque - EU"),
    FA("Persian (Farsi) - FA"),
    FI("Finnish - FI"),
    FR("French - FR"),
    GL("Galician - GL"),
    HE("Hebrew - HE"),
    HI("Hindi - HI"),
    HR("Croatian - HR"),
    HU("Hungarian - HU"),
    ID("Indonesian - ID"),
    IT("Italian - IT"),
    JA("Japanese - JA"),
    KR("Korean - KR"),
    LA("Latvian - LA"),
    LT("Lithuanian - LT"),
    MK("Macedonian - MK"),
    NO("Norwegian - NO"),
    NL("Dutch - NL"),
    PT("Portuguese - PT"),
    PT_BR("Português Brasil - PT_BR"),
    RO("Romanian - RO"),
    RU("Russian - RU"),
    SV("Swedish - SV"),
    SE("Swedish - SE"),
    SK("Slovak - SK"),
    SL("Slovenian - SL"),
    SP("Spanish - SP"),
    ES("Spanish - ES"),
    SR("Serbian - SR"),
    TH("Thai - TH"),
    TR("Turkish - TR"),
    UK("Ukrainian - UK"),
    UA("Ukrainian - UA"),
    VI("Vietnamese - VI"),
    ZH_CN("Chinese Simplified - ZH_CN"),
    ZH_TW("Chinese Traditional - ZH_TW"),
    ZU("Zulu - ZU");

    private final String description;

    Language(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
