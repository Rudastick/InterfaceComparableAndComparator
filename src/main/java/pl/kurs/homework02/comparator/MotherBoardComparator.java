package pl.kurs.homework02.comparator;

import pl.kurs.homework02.model.Computer;
import pl.kurs.model.Car;

import java.util.Comparator;

public class MotherBoardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = o1.getMotherboard().getProducer().compareTo(o2.getMotherboard().getProducer());
        if (result == 0) {
            result = o1.getMotherboard().getModel().compareTo(o2.getMotherboard().getModel());
        }
        if (result == 0) {
            result = o1.getMotherboard().getSocket().compareTo(o2.getMotherboard().getSocket());
        }
        return result;
    }
}
