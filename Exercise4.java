//Zadanie 6. Napisać program realizujący funkcje prostego kalkulatora,
//pozwalającego na wykonywanie operacji dodawania, odejmowania,
//mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma
//identyfikować sytuację wprowadzenia błędnego symbolu działania
//oraz próbę dzielenia przez zero. Zastosować instrukcję switch do
//wykonania odpowiedniego działania w zależności od
//wprowadzonego symbolu operacji. Scenariusz działania programu:
//a) Program wyświetla informację o swoim przeznaczeniu.
//b) Wczytuje pierwszą liczbę.
//c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//d) Wczytuje drugą liczbę.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("-----------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = input.nextInt();
        System.out.print("Podaj znak operacji (+, -, *, /): ");
        String sign = input.next();
        System.out.print("Podaj drugą liczbę: ");
        int b = input.nextInt();
        input.close();

        System.out.println("-----------------");

        switch (sign) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                if (b==0){
                    System.out.println("b is zero");
                } else {
                    System.out.println("a / b = " + (a / b));
                }
                break;
            default:
                System.out.println("Podano błędną operację");
        }

    }
}
