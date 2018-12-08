package pl.sda.ludwiczak.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumber181124 {
    // List<Integer>
    // 1000 elements - 1: 100 - Random
    // 51 - print index of 51 and finish (break)

    public static void main(String[] args) {

        int i = 0;

        List<Integer> integers = new ArrayList<>();

        for (i = 0; i < 1000; i++) {
            integers.add(new Random().nextInt(101)); // nowy int w zakresie do 101 bez 101 (do 100 włącznie)
        }

        for (i = 0; i < 1000; i++) {
            System.out.println(i + " " + integers.get(i));
        }

        for (i = 0; i < 1000; i++) {
            if (integers.get(i) == 51) {
                System.out.println("i: " + i);
                break;
            }
        }
    }


}