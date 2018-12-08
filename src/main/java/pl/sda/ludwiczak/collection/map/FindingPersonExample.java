package pl.sda.ludwiczak.collection.map;

import pl.sda.ludwiczak.equals_and_hashcode.Person;

import java.util.*;

public class FindingPersonExample {

    // map ids over Person
    // add 10 persons to map
    // find only personos younger than 25
    // add result to list

    public static void main(String[] args) {

        Map<String, Person> osoby = new HashMap<>();
        osoby.put("pierwsza",new Person ("Name1", "Surname1", 10));
        osoby.put("druga",new Person ("Name2", "Surname2", 100));
        osoby.put("trzecia",new Person ("Name3", "Surname3", 20));
        osoby.put("czwarta",new Person ("Name4", "Surname4", 90));
        osoby.put("piata",new Person ("Name5", "Surname5", 30));
        osoby.put("szosta",new Person ("Name6", "Surname6", 80));
        osoby.put("siodma",new Person ("Name7", "Surname7", 40));
        osoby.put("osma",new Person ("Name8", "Surname8", 70));
        osoby.put("dziewiata",new Person ("Name9", "Surname9", 50));
        osoby.put("dziesiata",new Person ("Name10", "Surname10", 60));

        List<Person> peopleArray = new LinkedList<>();


        Person currentPerson;

        for (String id : osoby.keySet()) {
            currentPerson = osoby.get(id);
            if (currentPerson.getAge() < 25) {
                peopleArray.add(currentPerson);

            }
        }

        for (Person p : peopleArray) {
            System.out.println("Young person: " + p);
        }


//        if (pierwsza.getAge() < 25) {
//            System.out.println("mniejsza1");
//            peopleArray.add(pierwsza);
//        }
//
//        if (druga.getAge() < 25) {
//            System.out.println("mniejsza2");
//            peopleArray.add(druga);
//        }
//
//        if (trzecia.getAge() < 25) {
//            System.out.println("mniejsza3");
//            peopleArray.add(trzecia);
//        }

    }


}
