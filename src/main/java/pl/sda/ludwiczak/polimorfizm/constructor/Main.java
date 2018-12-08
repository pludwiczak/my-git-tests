package pl.sda.ludwiczak.polimorfizm.constructor;

public class Main {
    public static void main(String[] args) {
//        Dish myLunch;
//        myLunch = new Dish();
//
//        Dish secondLunch = new Dish();


        System.out.println("///////////////////////////////");
        Pizza pizza = new Pizza();

        Cutlet cutlet = Cutlet.giveMeNewNormalCutlet();

        Cutlet onionCutlet = Cutlet.giveMeCutletWithOnion("red");

    }
}
