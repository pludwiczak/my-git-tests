package pl.sda.ludwiczak.sorting.car;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Comparator;

public class Car implements Comparable<Car>, CarConcat<Car> {

    private String brand;
    private String model;
    private String colour;
    private LocalDate productionYear;
    private int power;

    public Car(String brand, String model, String colour, LocalDate productionYear, int power) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.productionYear = productionYear;
        this.power = power;
    }

    // dodaliśmy tylko gettery, także nie będzie można zmieniać samochodów
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }


    public void maybeCompare(Comparable<Car> carComparable) {
            carComparable.compareTo(this);
    }


    @Override
    public int compareTo(Car car) {
        return productionYear.compareTo(car.productionYear);

    }

    @Override
    public void concatTwoBrands(Car object) {
        System.out.println(brand + "-" + object.brand);
    }

    public void doSomething(CarConcat<Car> carConcat) {
        carConcat.concatTwoBrands(this);
    }

}
