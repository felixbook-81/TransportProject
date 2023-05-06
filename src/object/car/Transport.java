package object.car;


import exception.TransportTypeException;
import object.Mechanic;
import object.driver.Driver;
import object.enums.Type;

import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;

    private final String model;

    private double engineVolume;

    private  List<Mechanic> mechanics;

    private T driver;
    private Type type;

    public Transport(String brand, String model, double engineVolume, T driver, Type type, List<Mechanic> mechanics) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        this.type = type;
        this.mechanics = mechanics;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }

        this.engineVolume = engineVolume;
    }

    public void printType(){
        if(type==null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(type);
    }
    public abstract void startMoving();


    public abstract void finishMoving();

    public void printInfo() {
        System.out.println("Водитель" + driver.getName() + " управляет автомобилем" + getBrand() + "  и будет учавствовать в заезде");
    }

    public void passDiagnostic() throws TransportTypeException {

    }

    public boolean checkSTO() {
        return true;
    }

    @Override
    public String toString() {

        return
                "Брэнд: " + brand + '\'' +
                        ", модель: " + model + '\'' +
                        ", Обьем двигателя: " + engineVolume + " Тип авто : " + type + " ";

    }

}


