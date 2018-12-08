package pl.sda.ludwiczak.equals_and_hashcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyCollectionsTest {

    // 2 lists
    // do każdej listy dodajemy po 500 elementów
    // first for searching
    // second for adding

    public static void main(String[] args) {

        Random random = new Random(100);
        random.nextInt();

        List<Integer> integersForSearch = new ArrayList<>();
        List<Integer> integersForAdding = new LinkedList<>();

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            integersForAdding.add(random.nextInt());
            integersForSearch.add(random.nextInt());
        }

        for (int i = integersForSearch.size() - 1; i > -1; i--) {
            System.out.println("integersForAdding[" + i + "]: " + integersForAdding.get(i));
            System.out.println("integersForSearch[" + i + "]: " + integersForSearch.get(i));
        }

        System.out.println(" ");
        System.out.println(integersForAdding);
        System.out.println(" ");
        System.out.println(integersForSearch);





//        List<Integer> number = new ArrayList();
//        number.add(new Integer() {
//        }
//
//
//        for (int i = 0; i < 500; i++) {
//            ArrayList[i] = i + 1;
//        }



    }

}
