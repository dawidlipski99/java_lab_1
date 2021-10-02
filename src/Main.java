import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan= new Scanner(System.in);
        /*5
        System.out.print("Podaj imię");
        String imie = scan.next();
        System.out.print("Podaj nazwisko");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr indeksu");
        int indeks = scan.nextInt();
        System.out.printf("Więc twoje imie to: %s, a nazwisko to: %s",imie,nazwisko);
        System.out.println("Masz " + wiek + " lat, a twój numer indeksu to:"+ indeks );

         */





        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        System.out.print("Podaj liczbe");
        int a = scan.nextInt();
        System.out.print("Podaj drugą liczbe");
        int b = scan.nextInt();
        int odejmowanie= a-b;
        System.out.println("Wynik dodawania:"+ a+b);
        System.out.print("Wynik odejmowania:"+ odejmowanie +"\n");
        System.out.println("Wynik mnożenia:"+a*b);
        System.out.println("Wynik dzielenia:"+a/b);
        System.out.println("Wynik dodawania:"+a%b);



    }
}
