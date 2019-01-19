package pl.sda.ludwiczak.garbage_collector;

public class StackOverflow {

    public static void main(String[] args) {
//        callMe();
        one();


    }

    public static void callMe() {
        callMe();
    }

    public static void one() {
        two();
    }

    public static void two() {
        one();
    }

}
