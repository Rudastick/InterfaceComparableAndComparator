package pl.kurs.comparator;

//Zasady:
//•	w pierwszej kolejności porównywanie po mocy auta – od największej do najmniejszej;
//•	jeżeli moce są takie same to porównywanie po momencie obrotowym – od najwyższego do najniższego;
//•	jeżeli z kolei wartości momentów obrotowych są takie same to porównujemy po prędkości maksymalnej auta – od największej do najmniejszej;

import pl.kurs.model.Car;

import java.util.Comparator;

public class PerformanceSpecsCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = Integer.compare(o2.getPowerHp(), o1.getPowerHp());
        if (result == 0) {
            result = Integer.compare(o2.getTorqueNm(), o1.getTorqueNm());
        }
        if (result == 0) {
            result = Integer.compare(o2.getvMaxInKph(), o1.getvMaxInKph());
        }
        return result;
    }
}
