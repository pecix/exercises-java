//Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//ekran największą oraz najmniejszą z nich.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = input.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = input.nextInt();

        int max;
        int min;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);

    }
}
