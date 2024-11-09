import java.util.Scanner;
public class cwiczenie2 {
    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do pobrania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // Pobieramy dochód od użytkownika
        System.out.print("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();

        // Zmienna przechowująca wynik obliczonego podatku
        double podatek = 0.0;

        // Obliczenie podatku zgodnie z zasadami
        if (dochod <= 85528) {
            // Podatek do 85.528 PLN
            podatek = dochod * 0.18 - 556.02;
        } else {
            // Podatek powyżej 85.528 PLN
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        // Jeśli wynik podatku jest mniejszy niż 0, ustawiamy go na 0
        if (podatek < 0) {
            podatek = 0;
        }

        // Wyświetlamy wynik
        System.out.printf("Należny podatek dochodowy wynosi: %.2f PLN\n", podatek);

        // Zamykamy scanner
        scanner.close();
    }
}

