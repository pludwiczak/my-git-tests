package pl.sda.ludwiczak.max;

import java.util.Scanner;

public class MaxMinMariusz {
    public static void main(String[] args) {
        System.out.println("Write 4 numbers");

        Scanner inputReader = new Scanner(System.in);


        int a = inputReader.nextInt();
        int b = inputReader.nextInt();
        int c = inputReader.nextInt();
        int c2 = inputReader.nextInt();

        int max = findMax(a, b, c, c2);
        System.out.println("Found max: " + max);

        int min = findMin(a, b, c, c2);
        System.out.println("Found min: " + min);

    }

    public static int findMax(int d, int e, int f, int z) {

        int max = d;

        if (e > max) {
            max = e;
        }
        if (f > max) {
            max = f;
        }
        if (z > max) {
            max = z;
        }

        return max;
    }


    public static int findMin(int g, int h, int i, int j) {

        int min = g;

        if (h < min) {
            min = h;
        }
        if (i < min) {
            min = i;
        }
        if (j < min) {
            min = j;
        }

        return min;
    }

}

