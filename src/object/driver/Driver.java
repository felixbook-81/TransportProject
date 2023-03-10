package object.driver;

public abstract class Driver {
    private String name;
    private boolean driverLicence;
    private  int experienceInYear;

    public Driver(String name, boolean driverLicence, int experienceInYear) {
        this.name = name;
        this.driverLicence = driverLicence;
        this.experienceInYear = experienceInYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public void setExperienceInYear(int experienceInYear) {
        this.experienceInYear = experienceInYear;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();
}
