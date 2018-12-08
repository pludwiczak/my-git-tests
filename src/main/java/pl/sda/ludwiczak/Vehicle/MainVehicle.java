package pl.sda.ludwiczak.Vehicle;

public class MainVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();

        Vehicle car = new Car();
        car.printName();
        Car carForSure = (Car) car;
        ((Car) car).speedUp();



        Car ferrari = new Car();
        ferrari.speedUp();
        ferrari.printName(); // dziedziczone

        Vehicle car2 = (Vehicle) ferrari; // z lewej "Vehicle" typ referencji


//        Boat boat = (Boat) car2; - rzutowanie w dół jest niebezpeczne, z samochodu nie można zrobić łódki






    }
}
