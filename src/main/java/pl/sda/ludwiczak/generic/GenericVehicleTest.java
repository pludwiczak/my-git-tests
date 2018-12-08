package pl.sda.ludwiczak.generic;

import pl.sda.ludwiczak.Vehicle.Car;
import pl.sda.ludwiczak.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {
    // method takes list of vehicle
    // send cars/planes
    // method for adding cars to list


    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        List<Vehicle> vehicleList = new ArrayList<>();



        GenericVehicleTest.addCar(vehicleList);
        GenericVehicleTest.getVehicleList(vehicleList);

        GenericVehicleTest.addCar(carList);
        GenericVehicleTest.getVehicleList(carList);

    }

        public static void  getVehicleList(List<? extends Vehicle> vehicles){
            for(Vehicle v : vehicles){
                System.out.println(v);
            }
        }

        public static void addCar(List<? super Car> vehicles){
            vehicles.add(new Car());
        }



    }
