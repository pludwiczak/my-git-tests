package pl.sda.ludwiczak.polimorfizm.constructor.continent;

public class Europe extends Continent {


    static {
        System.out.println("static Europe");
    }

    public Europe() {

    }

    {
        System.out.println("Instance Europe");
    }

}
