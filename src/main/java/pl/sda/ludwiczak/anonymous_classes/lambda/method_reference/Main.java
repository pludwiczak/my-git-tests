package pl.sda.ludwiczak.anonymous_classes.lambda.method_reference;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String a = "aaa";
        String b = "bbb";

        System.out.println(BrandSorter.brandOrder(a,b));
        System.out.println(BrandSorter.brandOrder(b,a));



        Car saab = new Car("Saab", "93", 200);
        Car porsche = new Car("Porsche", "Carrera", 250);


        List<Car>  sortedCars = CarSorter.sortCarsByModel(saab,porsche,((first, second) -> first.compareTo(second)));
        System.out.println(sortedCars);

        List<Car>  sortedCars2 = CarSorter.sortCarsByModel(saab,porsche,((first, second) -> second.compareTo(first)));
        System.out.println(sortedCars2); // zmiana kolejności


        CarSorter.sortCarsByModel(saab,porsche,((first, second) -> ModelSorter.modelOrder(first,second))); // linia z tą samą ideą co linia poniżej
        CarSorter.sortCarsByModel(saab,porsche,(ModelSorter::modelOrder)); // linia z tą samą ideą co linia powyżej

        CarPrinter carPrinter = car -> System.out.println(car); //  linia z tą samą ideą co linia poniżej
        carPrinter.printCar(saab);
        CarPrinter carPrinter2 = System.out::println; // System.out - obiekt ; weź jakiś tam obiekt i go wypisz
        // celem metoda printCar
        CarPrinter carPrinter3 = (Car car) -> System.out.println(car);

        CarPrinter carPrinter4 = car -> car.printYourself();
        CarPrinter carPrinter5 = Car::printYourself;

        carPrinter5.printCar(saab);


    }
}
