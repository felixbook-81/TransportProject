package object;

import object.car.Transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StationTO {
    private final Queue<Transport> transportQueue= new LinkedList<>();

    public void addTransport(Transport transport) {
        transportQueue.offer(transport);
    }

    public void makeTO() {
        while (transportQueue.peek() != null) { // получаем элемент - первый в очереди (из головы очереди), если он не null,
            Transport transport = transportQueue.poll(); // то берем первый элемент и удаляем его из очереди
            List<Mechanic> mechanics = transport.getMechanics(); // получаем механиков взятого на ТО транспорт
            System.out.println("Началось ТО " + transport.getModel()); // вывод информации о транспорте, который начали обслуживать
            mechanics.get(0).makeTO(); // получение первого механика, и он начинает свою работу - проводить то
        }
    }


}
