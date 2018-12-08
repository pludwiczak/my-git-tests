package pl.sda.ludwiczak.loop;

public class ForTest {
    public static void main(String[] args) {
        printNTimes(1, "ala1");
        printNTimes(2, "ala2");
        printNTimes(3, "ala3");
        printMyName(5, "Piotr");
    }

    public static void printNTimes (int numberOfTimes, String valueToPrint) {
        for (int i = 0; i < numberOfTimes; i++) { // jeśli i (0) jest mniejsze od numberOfTimes, to wykonuje instrukcje (i++), gdzie i=i+1;
            System.out.println(valueToPrint);
        }
    }


    public static void printMyName (int frequency, String whatToShow) {
        for (int i = 0; i <frequency; i++) {
            System.out.println(whatToShow);
        }
    }

    public static void infiniteLoop () {
        for (;;) {
        }
    }

}
