import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean done = false;

        while (!done) {
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.print("Podaj liczbę: ");
                int number = userInput.nextInt();
                userInput.close();

                if (number < 1) {
                    System.out.println("Podana liczba powinna być większa od 0");
                } else {
                    for (int i = 1; i <= number; i++)
                        done = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Proszę podać liczbę całkowitą");
            }
        }
//        int count = 0;
//
//        while (count < 10) {
//            System.out.print(count + ", ");
//            count++;
//        }

//        System.out.println(count);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Podaj liczbę: ");
//        try {
//            int Number = input.nextInt();
//
//            for (int i = 1; i <= Number; i++)
//        } catch (InputMismatchException exception)
//        System.out.println("Proszę podać liczbę całkowitą: ");
//        int testNumber = input.nextInt();
//        for (int i = 1; i <= Number; i++) {
//            for (int j = 1; j <= Number; j++) {
//                if (Number == j) {
//                    System.out.print(j);
//                } else {
//                    System.out.println(j + ", ");
//                }
//        final int CONDITION_NUMBER = 15;
//
//        CONDITION_NUMBER = 10;
//
//        if (number > CONDITION_NUMBER) {
//        System.out.println("Liczba jest większa od " + CONDITION_NUMBER);
//        } else if (number < CONDITION_NUMBER)
//            {
//            System.out.println("Liczba jest mniejsza od " + CONDITION_NUMBER);
//            else{
//            System.out.println("Liczba jest równa zero" + CONDITION_NUMBER);
//        }

//        System.out.println("Podana liczba to: " + Number);
//        if (Number > testNumber) {
//            System.out.println("Liczba " + Number + " jest większa od liczby " + testNumber);
//        } else if (Number == testNumber) {
//            System.out.println("Liczby są równe ");
//        } else {
//            System.out.println("Liczba " + Number + " jest mniejsza od liczby " + testNumber);
    }
}