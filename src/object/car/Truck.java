package object.car;

import object.driver.DriverC;
import object.enums.LoadCapacity;
import object.enums.Type;

public class Truck extends Transport<DriverC> {
private LoadCapacity loadCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, Type.TRUCK);
        this.loadCapacity=loadCapacity;
    }



    @Override
    public void startMoving() {
        System.out.println("Грузовик марки" + getBrand() + "Начал движение");

    }
    @Override
    public void finishMoving() {
        System.out.println("Грузовик марки" + getBrand() + "Закончил  движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestTime() {
        int minBound=90;
        int maxBound=140;
        int theBestTimeInMins = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах : "+ theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=90;
        int maxBound=130;
        int maxSpeed = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для грузовика"+ maxSpeed);
    }
}
