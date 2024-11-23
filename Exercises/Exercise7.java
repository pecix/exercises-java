package Exercises;//Zadanie 7. Napisać program, który pobiera od użytkownika liczbę
//całkowitą dodatnią, a na- stępnie wyświetla na ekranie kolejno
//wszystkie liczby niepatrzyste nie większe od podanej liczby.
//Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.

public class Exercise7 {
    public static void main(String[] args) {
        int number = Utils.inputIntStatic("Podaj liczbę: ");

        if (number < 0) {
            System.out.println("Podana liczba jest liczbą ujemną");
        } else {
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0) {
                    if (i < number) {
                        System.out.print(i + ", ");
                    } else {
                        System.out.print(i + ".");
                    }
                }
            }
        }
    }
}
