package pl.sda.ludwiczak.Vehicle;

public class Vehicle {
    public void printName() {
        System.out.println("Print me");
    }


    public void move() {
        System.out.println("Vehicle is moving");
    }

//    @Override - w miejscu gdzie definiujemy metodę nie możemy dać override!
    public void increaseSpeed() {
        System.out.println("increaseSpeed() from Vehicle");

    }


    @Override
    public String toString() {
        return "Vehicle";
    }
}
