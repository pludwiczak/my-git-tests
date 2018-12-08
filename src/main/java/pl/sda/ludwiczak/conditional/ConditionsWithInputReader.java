package pl.sda.ludwiczak.conditional;

import java.util.Scanner;
import java.lang.*;

public class ConditionsWithInputReader {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int age = inputReader.nextInt();

        testAge(age);

    }

        public static void testAge ( int age){ // metoda
            if (age < 11) {
                System.out.println("Masz do 10 lat");
            } else if (age > 18) {
                System.out.println("Masz powyżej 18 lat");
            } else if (age > 15) {
                System.out.println("Masz 16-18 lat");
            } else {
                System.out.println("Masz 11-15 lat");
            }
        }

}