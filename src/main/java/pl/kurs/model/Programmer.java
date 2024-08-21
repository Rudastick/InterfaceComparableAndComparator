package pl.kurs.model;

import java.util.Comparator;
import java.util.Objects;

public class Programmer implements Comparable<Programmer> {
    private String firstName;
    private String lastName;
    private double salary;
    private String mainProgrammingLanguage;
    private int experienceInYears;

    public Programmer(String firstName, String lastName, double salary, String mainProgrammingLanguage, int experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.mainProgrammingLanguage = mainProgrammingLanguage;
        this.experienceInYears = experienceInYears;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMainProgrammingLanguage() {
        return mainProgrammingLanguage;
    }

    public void setMainProgrammingLanguage(String mainProgrammingLanguage) {
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", mainProgrammingLanguage='" + mainProgrammingLanguage + '\'' +
                ", experienceInYears=" + experienceInYears +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Double.compare(salary, that.salary) == 0 && experienceInYears == that.experienceInYears && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(mainProgrammingLanguage, that.mainProgrammingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, mainProgrammingLanguage, experienceInYears);
    }


    //    Teraz zaimplementujmy metodę wg zasady:
//•	W pierwszej kolejności sortujemy po nazwisku alfabetycznie;
//•	kiedy nazwiska są te same to sortujemy po imieniu alfabetycznie;
//•	kiedy z kolei imiona też są te same to sortujemy po języku programowania alfabetycznie;
//•	kiedy z kolei języki są te same to sortujemy po wypłacie malejąco.

    @Override
    public int compareTo(Programmer o) {
        int result = lastName.compareTo(o.lastName);
        if (result == 0) {
            result = firstName.compareTo(o.firstName);
        }
        if (result == 0) {
            result = mainProgrammingLanguage.compareTo(o.mainProgrammingLanguage);
        }
        if (result == 0){
            result = Integer.compare(o.experienceInYears, experienceInYears);
        }
        if (result == 0) {
            result = Double.compare(o.salary, salary);
        }

        return result;
    }
}
