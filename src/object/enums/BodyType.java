package object.enums;

public enum BodyType {
    SEDAN("Седан"),

    HATCHBACK("Хэтчбек"),

    STATION_WAGON("Универсал"),

    SUV("Внедорожник"),

    CROSSOVER("Кроссовер"),

    PICKUP_TRUCK("Пикап"),

    VAN("Фургон"),

    MINIVAN("Минивэн");

    String title;

    BodyType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + title;
    }
}
