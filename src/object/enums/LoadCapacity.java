package object.enums;

public enum LoadCapacity {
    N1(null, 3.5F),

    N2(3.5F, 12.0F),

    N3(12.0F, null);

    private final Float min;
    private final Float max;

    LoadCapacity(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Грузоподъемность до " + max + " тонн";
        } else if (max == null) {
            return "Грузоподъемность от " + min + " тонн";
        } else {
            return "Грузоподъемность: " + min + " - " + max + " тонн";
        }
    }
}
