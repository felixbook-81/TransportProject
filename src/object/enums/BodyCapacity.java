package object.enums;

public enum BodyCapacity {
    ESPECIALLY_SMALL(null, 10),
    SMALL(10, 25),
    AVERAGE(25, 50),
    LARGE(50, 80),
    ESPECIALLY_LARGE(80, 120);

    private final Integer min;
    private final Integer max;

    BodyCapacity(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Вместимость до " + max + " мест";
        } else if (max == null) {
            return "Вместимость от " + min + " мест";
        } else {
            return "Вместимость: " + min + " - " + max + " мест";
        }
    }
}
