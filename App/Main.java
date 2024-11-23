package App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Jan", "Pierwszy");
        Person secondPerson = new Person("Kazimierz", "Drugi");
        Person thirdPerson = new Person("Imię", "Trzeci");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);
        Employee secondEmployee = new Employee(secondPerson, Departament.FINANCE);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        Company company = new Company("Moja firma");
        company.setEmployees(employees);

        Utils.printBanner("Panel administracyjny firmy " + company.getName());

        boolean done = false;

        while (!done) {
            Utils.printTable(List.of("Wyświetl pracowników", "Dodaj pracownika", "Zakończ program"), "Co chcesz zrobić");
            int choice = Utils.inputInt("Podaj numer operacji: ");

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(company.getEmployees());
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    String name = Utils.inputString("Podaj imię: ");
                    String surname = Utils.inputString("Podaj nazwisko: ");
                    company.getEmployees().add(new Employee(new Person(name, surname), null));
                    System.out.println("Dodano nowego pracownika");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Do zobaczenia");
                    System.out.println();
                    done = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Podano błędną wartość, spróbuj jeszcze raz");
                    System.out.println();
            }
        }
    }
}