package pl.sda.ludwiczak.sorting;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Mariusz", "P.", 35, -1, 10, 180, 40),
                new Person("Maria", "B", 15, 200, 10_000, 150, 15),
                new Person("Edward", "Nożycoręki", 100, 150, 10_000_000, 150, 42),
                new Person("Genowefa", "W.", 19, 187, 198, 160, 17),
                new Person("Hieronim", "Z", 55, 160, 1000, 165, 23)));


        Comparator<Person> myComparator = Comparator.comparing(Person::getName).
                thenComparing((o1, o2) -> o1.getSurname().
                        compareTo(o2.getSurname()));
        // gdy masz Comparator to możesz dać sortowanie w kilku "płaszczyznach" używając "thenComparing" (j.w.)

        Collections.sort(persons);
        System.out.println(persons);


        Collections.sort(persons, new ShoeComparator());
        System.out.println(persons);


        Collections.sort(persons, new IncomeComparator());
        System.out.println(persons);


        Collections.sort(persons, (o1, o2) -> (int) (o1.getHeight() - o2.getHeight()));
        Collections.sort(persons, (o1, o2) -> (int) (o1.getShoeSize() - o2.getShoeSize()));


        Collections.sort(persons, (first, second) -> first.getName().compareTo(second.getName()));
        Collections.sort(persons, Comparator.comparing(person -> person.getName()));
        Collections.sort(persons, NameComparing::comparePersonsByName);
        persons.sort(NameComparing::comparePersonsByName);


        //

        List<Garderoba> garderobas = new ArrayList<>(Arrays.asList(
                new Garderoba("tshirt", "M"),
                new Garderoba("socks", "L"),
                new Garderoba("tshirt", "L"),
                new Garderoba("sweter", "M"),
                new Garderoba("jacket", "L")));

        Collections.sort(garderobas, (o1, o2) -> o1.getSize().compareTo(o2.getSize()));
        Collections.sort(garderobas, (o1, o2) -> o1.getType().compareTo(o2.getType()));
        System.out.println(garderobas);


        Comparator<Garderoba> myComparatorGarderoba = Comparator.comparing(Garderoba::getSize).
                thenComparing((o1, o2) -> o1.getType().
                        compareTo(o2.getType()));

        Collections.sort(garderobas, myComparatorGarderoba);
        System.out.println(garderobas);


// reserved // pobawić się tym reserved
        Comparator<Garderoba> myComparatorGarderobaReserved = Comparator.comparing(Garderoba::getSize).reversed().
                thenComparing((o1, o2) -> o1.getType().
                        compareTo(o2.getType())).reversed();

        Collections.sort(garderobas, myComparatorGarderobaReserved);
        System.out.println(garderobas);



    }
}
