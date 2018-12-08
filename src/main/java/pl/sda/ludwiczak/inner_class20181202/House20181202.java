package pl.sda.ludwiczak.inner_class20181202;

import java.util.ArrayList;
import java.util.List;

public class House20181202 {

    private String houseName;
    private List<Apartment> apartments;

    public House20181202(String houseName) {
        this.houseName = houseName;

        apartments = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            apartments.add(new Apartment(30));
        }
    }



    public House20181202() {
        apartments = new ArrayList<>();
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }


    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }




    public class Apartment { // nie jest "static" - nie ma opcji, aby był apartament bez house
        int sizeInSqM;


        public Apartment (int sizeInSqM) {
            this.sizeInSqM = sizeInSqM;
        }


        public void printNameOfHouse() {
            System.out.println("House name: " + House20181202.this.houseName); // w tym wypadku nie ma znaczenia czy "House20181202.this.houseName" czy "houseName"
        }



        @Override
        public String toString() {
            return "Apartment{" +
                    "sizeInSqM=" + sizeInSqM +
                    '}';
        }
    }

}
