package pl.sda.ludwiczak.equals_and_hashcode;

import java.util.*;

public class EqualityTest {

    public static void main(String[] args) {

        List<Person> people = new ArrayList();
        people.add(new Person("mariusz", "p",35));
        people.add(new Person("mariusz", "p",35));
        people.add(new Person("mariusz", "p",15));
        people.add(new Person("marek", "p",5));


        Person personToFind = new Person("mariusz","p",15); // tworzysz nową osobę, której nie dodajesz do list

        System.out.println("contains: " + people.contains(personToFind)); // sprawdzasz czy w liście jest identyczna osoba jak dodana wyżej


        Set<Person> personSet = new HashSet<>(); // kolekcja
        personSet.addAll(people);
        System.out.println("Set size: " + personSet.size()); // set nie duplikuje elementów

        // gdy w Personie zakomentujesz hashCode, to set size uwzględnia także duplikaty
        // hashCode jest dziedziczony z Objecta
        // domyslnie equals porownuje referencje
        // domyslnie kazdy obiekt dostaje uniwersalny numerek

        for (Person p : personSet) { // w hashsetcie nie ma nacisku na kolejnosc, moze byc dowolna
            System.out.println("Person: " + p);
        }

        Set<Person> anotherSet = new LinkedHashSet<>(); // w linkedhashset kolejnosc ma znaczenie

        List<Person> personList = new LinkedList<>(); // LinkedList - przydatne do zachowania kolejnosci



    }



    // array lista przechowujaca 4 osoby, 3 rozne, 1 ma sie powtarzac, sprawdzic (contains)
    // add 4 persons
    // 2 duplicates

    // create new duplicate which exits in array
    // contains(Object)
}
