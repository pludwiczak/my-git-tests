package pl.sda.ludwiczak.inner_class20181202;

import static pl.sda.ludwiczak.inner_class20181202.Vehicle20181202.Wheel;

public class Vehicle_Main20181202 {

    public static void main(String[] args) {

        Vehicle20181202 vehicle = new Vehicle20181202("blabla",new Wheel(6));
        Wheel wheel = new Wheel(4);
        // gdybym nie zaimportował "Wheel" to linia wyżej musiałaby być napisana w następujący sposób: Vehicle20181202.Wheel wheel = new Vehicle20181202.Wheel(4);

        System.out.println(vehicle);

        System.out.println(wheel);

    }

}
