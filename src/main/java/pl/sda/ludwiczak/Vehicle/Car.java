package pl.sda.ludwiczak.Vehicle;

public class Car extends Vehicle {

    @Override
    public void move() {
//        super.move();
        System.out.println("Car is driving");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Car");

    }


    public void speedUp() { // metoda
        System.out.println("speedUp()");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
