//Zadanie 5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
//ratalna. Napisz program umożliwiający wyliczenie wysokości
//miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
//programu są:
//        • cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
//Kredyt jest oprocentowany w zależności od liczby rat:
//        • od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi 10%.
//Obliczona miesięczna rata powinna zawierać również odsetki.
//Program powinien sprawdzać, czy podane dane mieszczą się w
//określonych powyżej zakresach, a w przypadku błędu pytać prosić
//użytkownika ponownie o podanie danych.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Kalkulator ratalny");

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj kwotę: ");
        double price = input.nextDouble();

        System.out.print("Podaj liczbę rat: ");
        int rate = input.nextInt();

        input.close();

        double mulitiplier;

        if (rate >= 6 && rate <= 12) {
            mulitiplier = 0.025;
        } else if (rate > 12 && rate <= 24) {
            mulitiplier = 0.05;
        } else {
            mulitiplier = 0.1;
        }

        double interest = price * mulitiplier;
        double total = price + interest;
        double rateValue = total / rate;

        System.out.println("-----------------------");
        System.out.println("Odsetki: " + interest + "zł");
        System.out.println("Łączny koszt: " + total + "zł");
        System.out.println("Wysokość raty: " + rateValue + "zł");
    }
}
