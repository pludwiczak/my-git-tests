package pl.sda.ludwiczak.exception181124;

public class TestThrowerLevel181124 {

    public static void main(String[] args) {
        ThrowLevelTwo181124 l2 = new ThrowLevelTwo181124();
        try {
            l2.doIt();
        } catch (MyException181124 myException181124) {
            myException181124.printStackTrace();
        }
    }



}
