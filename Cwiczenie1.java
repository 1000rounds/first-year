import java.util.Scanner;
public class Cwiczenie1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("Temperatura w stopniach Fahrenheita: %1.2f°F\n", fahrenheit);

        scanner.close();
    }
}