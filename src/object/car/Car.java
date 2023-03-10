package object.car;


import object.driver.DriverB;
import object.enums.BodyType;
import object.enums.Type;

public  class Car extends Transport<DriverB> {
    private BodyType bodyType;

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,
               BodyType bodyType) {
        super(brand, model, engineVolume, driver, Type.CAR);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "Начал движение");

    }
    @Override
    public void finishMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "Закончил  движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void theBestTime() {
        int minBound=70;
        int maxBound=120;
        int theBestTimeInMins = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах : "+ theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=100;
        int maxBound=160;
        int maxSpeed = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автомобиля"+ maxSpeed);
    }

    @Override
    public String toString() {
        return super.toString() + bodyType;
    }

    @Override
    public void passDiagnostic() {
        System.out.println("Автомобиль может проходить диагностику");
    }
}




