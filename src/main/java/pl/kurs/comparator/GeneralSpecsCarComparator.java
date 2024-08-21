package pl.kurs.comparator;

import pl.kurs.model.Car;

import java.util.Comparator;

public class GeneralSpecsCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = o1.getAaaaaproducer().compareTo(o2.getAaaaaproducer());

        if (result == 0) {
            result = o1.getModel().compareTo(o2.getModel());
        }
        if (result == 0) {
            result = Character.compare(o2.getModelCode(), o1.getModelCode());
        }
        return result;
    }
}
