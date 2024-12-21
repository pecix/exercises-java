package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utils {
    static Company initData() {
        Person firstPerson = new Person("Jan", "Pierwszy");
        Person secondPerson = new Person("Kazimierz", "Drugi");
        Person thirdPerson = new Person("Imię", "Trzeci");
        Person fourthPerson = new Person("Imię", "Czwarty");
        Person fifthPerson = new Person("Imię", "Piąty");
        Person sixthPerson = new Person("Imię", "Szósty");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);
        Employee secondEmployee = new Employee(secondPerson, Departament.FINANCE);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);
        Employee fourthEmployee = new Employee(fourthPerson, Departament.FINANCE);
        Employee fifthEmployee = new Employee(fifthPerson, Departament.FINANCE);
        Employee sixthEmployee = new Employee(sixthPerson, Departament.SALES);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(fourthEmployee);
        employees.add(fifthEmployee);
        employees.add(sixthEmployee);

        Company company = new Company("Moja firma");
        company.setEmployees(employees);

        return company;
    }

    static int inputInt(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano błędną wartość");
            return inputInt(message);
        }
    }

    static String inputString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void printBanner(String title) {
        String border = "+" + "-".repeat(title.length() + 2) + "+";

        System.out.println("\n" + border);
        System.out.println("| " + title.toUpperCase() + " |");
        System.out.println(border + "\n");
    }

    static void printAnswer(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    static void printOptions() {
        System.out.println("Dostępne operacje:");
        System.out.println("1. Wyświetl pracowników");
        System.out.println("2. Dodaj pracownika");
        System.out.println("3. Zwolnij pracownika");
        System.out.println("4. Edytuj dane pracownika");
        System.out.println("5. Wyświetl pracowników wg działu");
        System.out.println("0. Zakończ program");
        System.out.println();
    }
}
