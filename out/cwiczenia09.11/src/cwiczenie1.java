//Napisac program pobierajacy od uzytkownika dwie liczby calkowite
//A oraz B, A < B, a nastepnie wyznaczajacy sume ciagu liczba od A do B, czyli sume ciagu (A, A +1,...,B).
//Obliczenia nalezy wykonac trzykrotnie sostujac kolejno petle: while, do-while, for.
import java.util.Scanner;
public class cwiczenie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pobieranie danych od uzytkownika
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int A = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int B = scanner.nextInt();
        scanner.close();

        //Sprawdzenie warunku a < b
        if (A >= B) {
            System.out.println("Błąd: A musi być mniejsze od B.");
            return;
        }

        //Obliczanie sumy za pomocą pętli while
        int sumaWhile = 0;
        int i = A;
        while (i <= B) {
            sumaWhile += i;
            i++;
        }
        System.out.println("Suma while: " + sumaWhile);

        //Obliczanie sumy za pomocą pętli do-while
        int sumaDoWhile = 0;
        i = A;
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= B);
        System.out.println("Suma do-while: " + sumaDoWhile);

        //Obliczanie sumy za pomocą pętli for
        int sumaFor = 0;
        for (i = A; i <= B; i++) {
            sumaFor += i;
        }
        System.out.println("Suma for: " + sumaFor);

        scanner.close();
    }
}