package pl.sda.ludwiczak.max.object;

public class Person {
    public static int numberOfPersons = 0;

    private String name;
    private String surname;
    private int age;

    public Person(String name) {
        this.name = name;
        numberOfPersons++;
    }

    public Person() // constructor domyślny + skoro zrobiliśmy sobie constructor, to musimy go dodać
    {
        numberOfPersons++;
    }

    public Person(String name, String surname, int age) { // TO JEST CONSTRUCTOR!!!!!!!!!
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPersons++;
    }


    // it's not CONSTRUCTOR, it's method
    public void Person() {

    }

    public void introducePerson() {
        System.out.println("My name is " + name + " and surname " + surname + ", I'm " + age + " years old.");

    }

    public static void somethingAboutPersons() {
        System.out.println("All people like math!!!!");

    }


    public static void accessToObjectPropertiesFromStatic() {
        // System.out.println("name" + name); - tak się nie da, bo nie widzi name
    }


    public static void printNumberOfPersons () {
        System.out.println("Number of persons so far: " + numberOfPersons);
    }



}
