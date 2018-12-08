package pl.sda.ludwiczak.collection;

import pl.sda.ludwiczak.polimorfizm.plant.Cactus;
import pl.sda.ludwiczak.polimorfizm.plant.Opuncja;
import pl.sda.ludwiczak.polimorfizm.plant.Plant;
import pl.sda.ludwiczak.polimorfizm.plant.Rose;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");


//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }

        for (String a : strings) {
            System.out.println(a);
        }


        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(5,3,1));
        plants.add(new Cactus(5,3,1));
        plants.add(new Cactus(5,3,1));

        plants.set(1, new Rose(30,5,0));

        for (Plant a : plants) {
            System.out.println(a);
        }




    }
}
