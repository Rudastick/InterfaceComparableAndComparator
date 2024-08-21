package pl.kurs.homework02.comparator;

import pl.kurs.homework02.model.Computer;

import java.util.Comparator;

public class GraphicsCardComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        int result = Integer.compare(o1.getGraphicsCard().getBusWidthMBit(), o2.getGraphicsCard().getBusWidthMBit());

        if (result == 0){
            result = o1.getGraphicsCard().getProducer().compareTo(o2.getGraphicsCard().getProducer());
        }
        return result;
    }
}
