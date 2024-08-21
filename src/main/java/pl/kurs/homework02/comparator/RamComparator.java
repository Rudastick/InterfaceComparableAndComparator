package pl.kurs.homework02.comparator;

import pl.kurs.homework02.model.Computer;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = Double.compare(o2.getRam().getSizeGB(), o1.getRam().getSizeGB());
        if (result == 0) {
            result = o1.getRam().getModel().compareTo(o2.getRam().getModel());
        }
        if (result == 0) {
            result = o1.getRam().getDdrType().compareTo(o2.getRam().getDdrType());
        }
        return result;
    }
}
