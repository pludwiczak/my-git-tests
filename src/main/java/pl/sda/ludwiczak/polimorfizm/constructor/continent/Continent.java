package pl.sda.ludwiczak.polimorfizm.constructor.continent;

public class Continent {

    private String theBiggestCountry;

    public Continent(int numberOfCountries) {

    }


    public Continent() {

    }

    public Continent(String theBiggestCountry) {

    }

    static {
        System.out.println("1. Static - Continent");
    }

    {
        System.out.println("1. Instance - Continent");
    }

    static {
        System.out.println("2. Static - Continent");
    }

    {
        System.out.println("2. Instance - Continent");
    }


}
