import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int b = input.nextInt();
        System.out.println("Podaj trzecią liczbę całkowitą: ");
        int c = input.nextInt();

        int max = max(max(a, b), c);
        int min = min(min(a, b), c);
        System.out.printf("Największa liczba to: " + max);
        System.out.printf("Najmniejsza liczba to: " + min);
    }
}