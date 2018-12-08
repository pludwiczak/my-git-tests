package pl.sda.ludwiczak.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {

    public static void main(String[] args) {

        Map<String, String> idsOverNames = new HashMap<>(); // w nawiasach ostrych przy Map podajemy dwa typy: klucz i wartość, przy mapie hashe liczone są przy kluczach
//        idsOverNames.put("1989","Piotr"); // klucze nie mogą się powtarzać
//        idsOverNames.put("1985","Aneta");
//        idsOverNames.put("2017","Lidia");

        System.out.println(idsOverNames.put("1989","Mariusz"));
        System.out.println(idsOverNames.put("1989","Marcin"));


        Map<String, String> pesele = new HashMap<>();
        pesele.put("1","Piotr");
        pesele.put("2","Aneta");
        pesele.put("3","Lidia");
        pesele.put("4","Anna");
        pesele.put("5","Marcin");

        for (String key : pesele.keySet()) {
            System.out.println("Key: " + key + ", value: " + pesele.get(key));
        }


        Map<String,String> secondMap = new LinkedHashMap<>();




    }

}
