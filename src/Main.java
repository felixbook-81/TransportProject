import exception.TransportTypeException;
import object.Mechanic;
import object.StationTO;
import object.car.*;
import object.driver.DriverB;
import object.driver.DriverC;
import object.driver.DriverD;
import object.enums.BodyCapacity;
import object.enums.LoadCapacity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static object.enums.BodyType.SEDAN;

public class Main {
    public static void main(String[] args) {
        StationTO stationTO = new StationTO();

        // создание механиков
        Mechanic mechanic1 = new Mechanic("Mike", "Smith", "Company 1");
        Mechanic mechanic2 = new Mechanic("Leo", "Dicaprio", "Company 2");
        Mechanic mechanic3 = new Mechanic("Sven", "Petrov", "Company 3");
        Mechanic mechanic4 = new Mechanic("Peter", "Ivanov", "Company 3");

        // создание машины, водителя для нее и механиков
        DriverB driverB = new DriverB("Driver cat. B" , true, 5 );
        List<Mechanic> carMechanics = new ArrayList<>();
        carMechanics.add(mechanic1);
        Car car = new Car(
                "Car brand № 1" ,
                "Car model № 1" ,
                1.6,
                driverB,
                SEDAN,
                carMechanics
        );

        // создание водителя для автобуса, механиков и автобуса
        DriverC driverC = new DriverC(
                "Driver cat. C" ,
                true,
                7 );
        List<Mechanic> truckMechanics = new ArrayList<>();
        truckMechanics.add(mechanic3);
        truckMechanics.add(mechanic4);
        Truck truck = new Truck(
                "Truck brand № 2" ,
                "Truck model № 2" ,
                4.5,
                driverC,
                LoadCapacity.N1,
                truckMechanics
        );

        // создание водителя для грузовой машины, механиков для него и грузовой автомобль
        DriverD driverD = new DriverD("Driver cat. D" ,
                true,
                10 );

//        List<Mechanic> busMechanics = new ArrayList<>(List.of(mechanic1, mechanic2));
        List<Mechanic> busMechanics = new ArrayList<>();
        busMechanics.add(mechanic1);
        busMechanics.add(mechanic2);

        Bus bus = new Bus(
                "Bus brand № 3" ,
                "Bus model № 3" ,
                4.0,
                driverD,
                BodyCapacity.LARGE,
                busMechanics);

        List<Transport> transports = new ArrayList<>();

        transports.add(car);
        transports.add(truck);
        transports.add(bus);

        for (int i = 0; i < transports.size(); i++) {
            // получене по индексу транспорта
            Transport transport = transports.get(i);
            System.out.println("Водитель " + transport.getModel() + " " + transport.getDriver().getName());
            System.out.println(transport.getModel() + " обслуживают следующие механики: ");
            List<Mechanic> mechanics = transport.getMechanics();
            // вывод всех механиков
            for (Mechanic mechanic : mechanics) {
                System.out.println(mechanic);
            }
            System.out.println();
        }

        // проходимся по списку транспортов и добавляем в очередь на ТО
        for (int i = transports.size() - 1; i >= 0 ; i--) {
            Transport transport = transports.get(i);

            // проверка на необходимость ТО
            if(transport.checkSTO()) {
                // добавление в очередь на ТО на станции ТО
                stationTO.addTransport(transport);
            }
        }

        // запускаем ТО автомобилей в очереди на станции ТО
        stationTO.makeTO();





//
//        System.out.println(car);
//        System.out.println(truck);
//        System.out.println(bus);
//
//        car.passDiagnostic();
//        truck.passDiagnostic();
//        try {
//            bus.passDiagnostic();
//        } catch (TransportTypeException exception) {
//            System.out.println("\033[91m" + exception.getMessage() + "\033[0m");
//        }

    }

//
//    private static void printInfo(Transport<?> transport) {
//        System.out.println("Водитель " + transport.getDriver().getName() + "  управляет  " + transport.getBrand() + "  будет учавствовать в заезде");
//    }
}