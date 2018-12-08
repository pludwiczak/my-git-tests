package pl.sda.ludwiczak.max;

import java.util.Scanner;
import java.lang.Math;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Write 3 numbers");

        Scanner inputReader = new Scanner(System.in);


        int no1 = inputReader.nextInt();
        int no2 = inputReader.nextInt();
        int no3 = inputReader.nextInt();


        int max = Math.max(Math.max(no1,no2),no3);

        System.out.println("Max number is... " + max);



        if (no1 > no2) {
            if (no1 > no3) {
                System.out.println("Max number is " + no1);
            }
        }
        else if (no2 > no1) {
            if (no2 > no3) {
                System.out.println("Max number is " + no2);
            }
            else System.out.println("Max number is " + no3);
        }




        if (no1 < no2) {
            if (no1 < no3) {
                System.out.println("Min number is " + no1);
            }
        }
        else if (no2 < no1) {
            if (no2 < no3) {
                System.out.println("Min number is " + no2);
            }
            else System.out.println("Min number is " + no3);
        }






    }
}
