package pl.sda.ludwiczak.sorting.car;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 7 aut
        // do kolekcji
        // naturalny porządek (Comparable) - po dacie produkcji

        List<Car> cars = Arrays.asList(
                new Car("renault", "laguna", "black", LocalDate.of(2008, 12, 10), 150),
                new Car("porsche", "carrera", "white", LocalDate.of(2008, 12, 20), 110),
                new Car("alfa", "159", "black", LocalDate.of(2007, 12, 10), 160),
                new Car("mercedes", "c", "white", LocalDate.of(2009, 11, 10), 120),
                new Car("porsche", "panamera", "black", LocalDate.of(2010, 12, 10), 170),
                new Car("renault", "kangoo", "white", LocalDate.of(2005, 12, 10), 130),
                new Car("dacia", "logan", "black", LocalDate.of(2010, 12, 11), 170)
        );

        System.out.println("Before sorting");
        System.out.println(cars);
        System.out.println("After sorting");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("/////////////////////");

        //        Collections.sort(cars, new CarPowerComparator());
        cars.sort(new CarPowerComparator()); // to samo co linia wyżej
        System.out.println(cars);
        cars.sort(new CarPowerComparator().reversed()); // to samo co linia wyżej TYLKO W ODWROTNEJ KOLEJNOSCI!!!!!
        System.out.println(cars);

        cars.sort(new Comparator<Car>() { // starym sposobem
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColour().compareTo(o2.getColour());
            }
        });

        cars.sort((o1, o2) -> o1.getColour().compareTo(o2.getColour())); // nowym sposobem na lambdę (czy to jest to samo co wyżej?)

        // CarPlayer
        // wysłać cara do niego
        // wysłać lambda x 2 (wykonować 2 metodę playWithCarAction)

        CarPlayer one = new CarPlayer();
        one.playWithCarAction(cars.get(2),
                car -> System.out.println("Car is flying... " + car));


        cars.get(0).concatTwoBrands(cars.get(1)); // inna kolejność niż pierwotna kolejnosc w tabeli, bo w miedzyczasie kolejnosc byla sortowana
        cars.get(0).doSomething(object -> System.out.println(object.getBrand() + "-"));


    }

}
