import java.util.Scanner;
public class cwiczenie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

        System.out.print("Wybierz operację (+, -, *, /: ");
        char operator = scanner.next().charAt(0);

        double wynik;

        switch (operator) {
            case '+':
                wynik = num1 + num2;
                System.out.println("Wynik: " + wynik);
                break;
            case '-':
                wynik = num1 - num2;
                System.out.println("Wynik: " + wynik);
                break;
            case '*':
                wynik = num1 * num2;
                System.out.println("Wynik: " + wynik);
                break;
            case '/':
                if (num2 != 0) {
                    wynik = num1 / num2;
                    System.out.println("Wynik: " + wynik);
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                }
                break;
            default:
                System.out.println("Błąd: Nieznany operator.");
                break;
        }
        scanner.close();
    }
}
