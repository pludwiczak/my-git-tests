package pl.sda.ludwiczak;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;



    // constructor - porządkowanie
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
        public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public String toString() { // prototyp - pierwsza linijka metody
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }


    public static void main(String[] args) {
        Car skoda = new Car("Skoda", "Fabia", "white", 2018);

        // renault to jest referencja
        Car renault = new Car("Renault", "Laguna", "black", 2008);

        // autoPiotra to jest referencja do obiektu renault
        Car autoPiotra = renault;

        System.out.println("Auto Piotra " + autoPiotra);
        System.out.println("Renault " + renault);

        // referencja - wskaźnik do obiektu w Java
        autoPiotra.setColor("gray");
        System.out.println(autoPiotra);

        System.out.println(autoPiotra.getColor());
        System.out.println(autoPiotra.getBrand());






    }


}
