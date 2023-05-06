package object.car;


import exception.TransportTypeException;
import object.Mechanic;
import object.driver.DriverD;
import object.enums.BodyCapacity;
import object.enums.Type;

import java.util.List;

public class Bus extends Transport<DriverD> {
    private BodyCapacity bodyCapacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               BodyCapacity bodyCapacity,
               List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, Type.BUS, mechanics);
        this.bodyCapacity = bodyCapacity;
    }

    public BodyCapacity getBodyCapacity() {
        return bodyCapacity;
    }

    public void setBodyCapacity(BodyCapacity bodyCapacity) {
        this.bodyCapacity = bodyCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки" + getBrand() + "Начал движение");

    }
   @Override
    public void finishMoving() {
        System.out.println("Автобус марки" + getBrand() + "Закончил  движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestTime() {
        int minBound=100;
        int maxBound=150;
        int theBestTimeInMins = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах : "+ theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=80;
        int maxBound=120;
        int maxSpeed = (int)(maxBound+ (maxBound-minBound)*Math.random());
        System.out.println("Лучшее время круга для автобуса"+ maxSpeed);
    }

    @Override
    public void printType() {
        System.out.println();
    }

    @Override
    public void passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусам проходить диагностику не нужно.");
    }

    @Override
    public boolean checkSTO() {
        return false;
    }
}