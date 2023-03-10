import exception.TransportTypeException;
import object.car.*;
import object.driver.DriverB;
import object.driver.DriverC;
import object.driver.DriverD;
import object.enums.BodyCapacity;
import object.enums.LoadCapacity;

import java.util.ArrayList;

import static object.enums.BodyType.SEDAN;

public class Main {
    public static void main(String[] args) {


        DriverB driverB = new DriverB("Driver cat. B" , true, 5 );
        Car car = new Car(
                "Car brand № 1" ,
                "Car model № 1" ,
                1.6,
                driverB,
                SEDAN
        );
        DriverC driverC = new DriverC(
                "Driver cat. C" ,
                true,
                7 );

        Truck truck = new Truck(
                "Truck brand № 2" ,
                "Truck model № 2" ,
                4.5,
                driverC, LoadCapacity.N1
        );

        DriverD driverD = new DriverD("Driver cat. D" ,
                true,
                10 );
        Bus bus = new Bus(
                "Bus brand № 3" ,
                "Bus model № 3" ,
                4.0,
                driverD,
                BodyCapacity.LARGE);

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

        car.passDiagnostic();
        truck.passDiagnostic();
        try {
            bus.passDiagnostic();
        } catch (TransportTypeException exception) {
            System.out.println("\033[91m" + exception.getMessage() + "\033[0m");
        }

    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + "  управляет  " + transport.getBrand() + "  будет учавствовать в заезде");
    }
}