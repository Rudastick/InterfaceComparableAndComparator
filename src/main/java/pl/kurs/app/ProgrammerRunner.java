package pl.kurs.app;

import pl.kurs.model.Programmer;

import java.util.Arrays;

public class ProgrammerRunner {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Krzysztof", "Grzybek",
                10_000.0D, "Java", 1);
        Programmer programmer2 = new Programmer("Adam", "Grzybek",
                10_000.0D, "Java", 2);
        Programmer programmer3 = new Programmer("Adam", "Wysieński",
                10_000.0D, "Java", 3);
        Programmer programmer4 = new Programmer("Adam", "Wysieński",
                10_000.0D, "Python", 4);
        Programmer programmer5 = new Programmer("Adam", "Wysieński",
                15_000.0D, "C", 10);
        Programmer programmer6 = new Programmer("Adam", "Wysieński",
                20_000.0D, "C", 2);

        Programmer[] programmers = {programmer1, programmer2, programmer3, programmer4, programmer5, programmer6};

        System.out.println("Przed posrotowaniem : ");

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("Po posortowaniu: ");

        Arrays.sort(programmers);

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

    }
}
