package pl.sda.ludwiczak.polimorfizm.constructor;

public class Cutlet {

    private Cutlet() {
        System.out.println("Cutlet");
    }

    public static Cutlet giveMeNewNormalCutlet() {
        return new Cutlet();
    }

    public static Cutlet giveMeCutletWithOnion(String onionKind) {
        return new Cutlet(onionKind);
    }

    private Cutlet(String onionKind) {

    }

}
