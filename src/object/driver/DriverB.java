package object.driver;

public class DriverB extends Driver{
    public DriverB(String name,
                   boolean driverLicence,
                   int experienceInYear) {
        super(name, driverLicence, experienceInYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В"+ getName() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В"+ getName() + "закончил движение");
    }


    @Override
    public void refill() {
        System.out.println("Водитель категории В"+ getName() + "заправляет авто");
    }
    }

