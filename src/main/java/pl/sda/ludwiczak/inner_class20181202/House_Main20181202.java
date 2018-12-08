package pl.sda.ludwiczak.inner_class20181202;

public class House_Main20181202 {

    public static void main(String[] args) {
        House20181202 myHouse = new House20181202("New Residence");

        House20181202 betterHouse1 = new House20181202();
        betterHouse1.setHouseName("Java home"); // nazwa inwestycji dot. betterHouse1
        House20181202.Apartment myNewApartment = betterHouse1.new Apartment(80);
        House20181202.Apartment newApartment = betterHouse1.new Apartment(77);

        myNewApartment.printNameOfHouse();
        newApartment.printNameOfHouse();



        House20181202 betterHouse2 = new House20181202();
        betterHouse2.setHouseName("C# home");
        House20181202.Apartment friendApartment = betterHouse2.new Apartment(30);

        friendApartment.printNameOfHouse();

    }



}
