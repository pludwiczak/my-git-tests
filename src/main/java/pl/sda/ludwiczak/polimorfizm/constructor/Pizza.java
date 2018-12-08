package pl.sda.ludwiczak.polimorfizm.constructor;

public class Pizza extends Dish {

    static {
        System.out.println("Pizza - static block");
    }

    {
        System.out.println("Pizza - instance block");
    }

    public Pizza() {
        this("tiuna");
        System.out.println("Pizza()");
    }

    public Pizza(String additions) {
        super(); // wywołanie konstruktora z nadklasy
        System.out.println("Pizza with additions..." + additions);
    }

}
