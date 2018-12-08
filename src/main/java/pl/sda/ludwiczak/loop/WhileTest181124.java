package pl.sda.ludwiczak.loop;

public class WhileTest181124 {



    public static void main(String[] args) {

        char currentChar = 'a';

        while (currentChar != 'r') {
            // read char
        }

        for (; currentChar != 'r'; ) {
            // read char
        }

        do {
            // do something
        } while (currentChar != 'r');


        // symulacja petli "do while" za pomoca petli "while"
        System.out.println("a");
        while (currentChar != 'r') {
            // read char
        }

    }

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i < 52) {
                System.out.println("i: " + i);
            }
        }
    }

    public static void printNumbers2() {
        for (int i = 1; i <= 100000; i++) {
            if (i < 52) {
                System.out.println("i: " + i);
            } else
                break; // jeśli osiągniesz warunek raz, to zakończ pętlę
        }
    }

}




