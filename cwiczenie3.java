import java.util.Scanner;

public class cwiczenie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwotę towaru: ");
        double price = input.nextDouble();
        System.out.print("Podaj ilość rat");
        int rate = input.nextInt();

        input.close();
        double interest = 0;
        double total = 0;
        double rateValue = 0;

        System.out.println("Kwota produktu: " + price + "zł");
        System.out.println("Liczba rat: " + rate);
        System.out.println("----------------------");
        System.out.println("Odsetki: ");
        System.out.println("Łączny koszt: ");
        System.out.println("Wysokość raty: " + rateValue + "zł");

    }
}