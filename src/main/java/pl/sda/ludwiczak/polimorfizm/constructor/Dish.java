package pl.sda.ludwiczak.polimorfizm.constructor;

public class Dish {

    private String kind;

    {
        System.out.println("Dish - First int block");
    }


    static {
        System.out.println("Dish - Static first initialization");
    }


    {
        System.out.println("Dish - Second int block");
    }



    public Dish() {  // constructor

        this("pasta");
        //
        System.out.println("Dish()");

    }


    public Dish(int hmmm) {

    }


    public Dish(String kind) { // overloading - przeciazenie, przeladowanie - druga metoda w tej samej klasie o tej samej nazwie (ale inny typ/parametr)
        System.out.println("Dish() " + kind);
        this.kind = kind;
    }



    static {
        System.out.println("Dish - Static dish class initialization");
    }

}
