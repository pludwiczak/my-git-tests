package pl.sda.ludwiczak.polimorfizm.constructor;

public class Person implements Nervous {

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        this(name, "Anonim", 0);
    }

    public Person(String name, String surname) {
        this(name, surname, 0);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public void introduceYourself() {

    }
}
