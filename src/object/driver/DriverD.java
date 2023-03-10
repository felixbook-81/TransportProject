package object.driver;

public class DriverD extends Driver{
    public DriverD(String name,
                   boolean driverLicence,
                   int experienceInYear) {
        super(name, driverLicence, experienceInYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D"+ getName() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D"+ getName() + "закончил движение");
    }


    @Override
    public void refill() {
        System.out.println("Водитель категории D"+ getName() + "заправляет авто");
    }
}


