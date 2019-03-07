package pl.sda.ludwiczak.Serialization;

import java.io.*;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Person maybeMe = new Person("Mariusz", "P");
        Person fullPerson = new Person("M", "P", Optional.of("nick"), new Address("warszawa", "smoka", 20));

        Animal pig = new Animal("Peppa",60,true,5);

//        String myPath1 = "E://aktualizacje//SDA//person1.ser";

        String myPath2 =
                "E:"
                        + File.separator + "aktualizacje"
                        + File.separator + "SDA"
                        + File.separator + "person2.ser";

        String myPath3 =
                "E:"
                        + File.separator + "aktualizacje"
                        + File.separator + "SDA"
                        + File.separator + "person3.ser";

        String pathPeppa =
                "E:"
                        + File.separator + "aktualizacje"
                        + File.separator + "SDA"
                        + File.separator + "Peppa.ser";

//        System.out.println(myPath2);
//        System.out.println(myPath3);

        try
                (ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(myPath2)))
        // serializer powyżej zostanie zamknięty automatycznie jako jedyny
        // jak masz w "try", to nie musisz pamiętać, aby zamknąć

        {
            serializer.writeObject(maybeMe);


            ObjectOutputStream serializer2 = new ObjectOutputStream(new FileOutputStream(myPath3));
            serializer2.writeObject(fullPerson);


            ObjectOutputStream serializer3 = new ObjectOutputStream(new FileOutputStream(pathPeppa));
            serializer3.writeObject(pig);

        } catch (IOException e) {
            e.printStackTrace();
        }


//        ObjectInputStream deserializer = null;


        try (ObjectInputStream deserializer2 = new ObjectInputStream(new FileInputStream(myPath3))) {
            System.out.println("Before deserialization");
            Person maybeMy = (Person) deserializer2.readObject();
            System.out.println(maybeMy);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try
                (ObjectInputStream deseliarizerPeppa = new ObjectInputStream(new FileInputStream(pathPeppa)))
        {
            Animal animal = (Animal) deseliarizerPeppa.readObject();
            System.out.println(animal);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
