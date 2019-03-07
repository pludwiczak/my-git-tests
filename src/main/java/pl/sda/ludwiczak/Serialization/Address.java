package pl.sda.ludwiczak.Serialization;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String street;
    private int flatNumber;

    public Address(String city, String street, int flatNumber) {
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
