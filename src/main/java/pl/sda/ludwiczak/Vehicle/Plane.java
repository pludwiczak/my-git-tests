package pl.sda.ludwiczak.Vehicle;

public class Plane extends Vehicle {

    @Override
    public void move() {
//        super.move();
        System.out.println("Plane is flying");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Plane");

    }


    @Override
    public String toString() {
        return "Plane";
    }

}
