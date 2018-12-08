package pl.sda.ludwiczak;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Choose your action: 1 - addition, 2 - substraction, 3 - multiplication, 4 - division");

        Scanner inputReader = new Scanner(System.in);

        int action = inputReader.nextInt();

            if (action > 4) {
                System.out.println("Such action doesn't exist! Please run the program again and choose a number from 1 to 4");
            } else if (action > 3) {
                System.out.println("You've chosen the division ");
                System.out.println("Please write the counter");
                double counter = inputReader.nextInt();
                System.out.println("Please write the denominator");
                double denominator = inputReader.nextInt();
                    if (denominator != 0) {
                        double division = counter / denominator;
                        String divisionString = String.format("%.2g%n", division);
                        System.out.println("The result is... " + divisionString);}
                        else {
                            System.out.println("The denominator cannot be 0! Back to school!");
                        }
            } else if (action > 2) {
                System.out.println("You've chosen the multiplication ");
                System.out.println("Please write two numbers to multiply");
                int number1M = inputReader.nextInt();
                int number2M = inputReader.nextInt();
                int multiplication = number1M * number2M;
                System.out.println("The result is... " + multiplication);
            } else if (action > 1) {
                System.out.println("You've chosen the substraction ");
                System.out.println("Please write two numbers to substract (number 1 - number 2)");
                int number1S = inputReader.nextInt();
                int number2S = inputReader.nextInt();
                int substraction = number1S - number2S;
                System.out.println("The result is... " + substraction);
            } else if (action > 0) {
                System.out.println("You've chosen the addition ");
                System.out.println("Please write two numbers to add");
                int number1A = inputReader.nextInt();
                int number2A = inputReader.nextInt();
                int addition = number1A + number2A;
                System.out.println("The result is... " + addition);
            } else {
                System.out.println("Such action doesn't exist! Please run the program again and choose a number from 1 to 4");
            }
    }


}