package pl.kurs.homework02.comparator;

import pl.kurs.homework02.model.Computer;

import java.util.Comparator;

public class HardDriveComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = o1.getHardDrive().getModel().compareTo(o2.getGraphicsCard().getModel());
        if (result == 0) {
            result = Double.compare(o1.getHardDrive().getCapacity(), o2.getHardDrive().getCapacity());
        }
        return result;
    }
}
