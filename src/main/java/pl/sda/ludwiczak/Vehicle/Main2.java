package pl.sda.ludwiczak.Vehicle;

public class Main2 {


    // TODO: virtual method
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();


        vehicle.move();
        car.move();
        boat.move();
        plane.move();



        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(plane);



        increaseSpeedOfVehicle(vehicle);
        increaseSpeedOfVehicle(car);
        increaseSpeedOfVehicle(boat);
        increaseSpeedOfVehicle(plane);
        increaseSpeedOfVehicle(new Car());

    }

    public static void processVehicle(Vehicle vehicle2) { // metoda - kawałek funkcjonalności / public static - metoda publiczna widoczna z zewnątrzn, static - metoda związana z klasą / void - nie zwraca żadnej zmiennej (zwraca np. tekst), w nawiasie (typ + argument)

        System.out.println(vehicle2); // dodaliśmy w klasach Vehicle, Car i Boat linie kodu (ctrl + O + to string), aby po wywołaniu metody processVehicle pojawiał się tekst Vehicle, Car, Boat, a nie odniesienia do klas


    }


    public static void increaseSpeedOfVehicle(Vehicle vehicle3) {
        System.out.println("from method increaseSpeed(Vehicle)");
        vehicle3.increaseSpeed(); // ta metoda uruchomi się z Vehicle/Car/Boat/Plane o ile w tych klasach są zdefiniowane metody increaseSpeed, jeśli w tych klasach nie ma zdefiniowanej metody increaseSpeed, to uruchomi metodę zdefiniowaną w Vehicle (jako "matki" pozostałych (Car, Boat, Plane) klas)
        System.out.println();

// polimorfizm - mając referencję wyższego poziomu, mozemy wskazywac na wszystkie obiekty, ktore dziedzicza po nim

    }



}
