package pl.kurs.app;

import pl.kurs.comparator.GeneralSpecsCarComparator;
import pl.kurs.comparator.PerformanceSpecsCarComparator;
import pl.kurs.model.Car;

import java.util.Arrays;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Corsa", 'x', 100, 130, 160);
        Car car2 = new Car("Opel", "Corsa", 'C', 100, 130, 160);

        GeneralSpecsCarComparator generalComparator = new GeneralSpecsCarComparator();

        System.out.println(generalComparator.compare(car1, car2));

        PerformanceSpecsCarComparator performanceSpecsCarComparator = new PerformanceSpecsCarComparator();

        System.out.println(performanceSpecsCarComparator.compare(car1, car2));

        Car car3 = new Car("Opel", "Corsa", 'B', 125, 130, 160);
        Car car4 = new Car("Opel", "Corsa", 'C', 125, 150, 160);
        Car car5 = new Car("Opel", "Corsa", 'B', 100, 130, 160);
        Car car6 = new Car("Opel", "Corsa", 'C', 105, 130, 160);

        Car[] cars = {car3, car4, car5, car6};

        Arrays.sort(cars, generalComparator);

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("=--------------");
        System.out.println("_)");

        Arrays.sort(cars, performanceSpecsCarComparator);

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
