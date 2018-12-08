package pl.sda.ludwiczak.scanner;

import java.util.Scanner;
import java.lang.*;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("pierwsza");
        int intValue = inputReader.nextInt();
        System.out.println("druga");
        int secondValue = inputReader.nextInt();
        System.out.println("trzecia");
        int thirdValue = inputReader.nextInt();

        System.out.println("Ive got three ints value: " + intValue + " and " + secondValue + " and " + thirdValue);

        int a = intValue * secondValue * thirdValue;

        System.out.println("The multiplication of numbers above gives... " + a);

        for (; inputReader.hasNext();) {
            if (inputReader.hasNextInt()) {
                System.out.println(inputReader.next());
            } else
                inputReader.next(); // zwraca jako stringa

        }
    }
}
