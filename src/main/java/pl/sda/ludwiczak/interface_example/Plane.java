package pl.sda.ludwiczak.interface_example;

public class Plane extends Vehicle implements Flyable {
//        implements Moveable (z defaultu implementuje, bo Vehicle is moveable)

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }
}
