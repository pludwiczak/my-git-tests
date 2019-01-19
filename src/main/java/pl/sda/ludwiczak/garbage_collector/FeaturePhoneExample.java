package pl.sda.ludwiczak.garbage_collector;

import java.util.HashSet;
import java.util.Set;

public class FeaturePhoneExample {

    public static void main(String[] args) {

        int i = 0;


        Set<FeaturePhone> phones = new HashSet<>();
        for (i = 0; i < 10000000; i++) {
            phones.add(new FeaturePhone("Nokia 3210"));
        }


//        FeaturePhone nokia1 = new FeaturePhone("Nokia 3210");
//        FeaturePhone nokia2 = new FeaturePhone("Nokia 3210");

//        System.out.println("nokia1 =? nokia2: " + (nokia1.equals(nokia2)));

//        phones.add(nokia1);
//        phones.add(nokia2);

        System.out.println(phones);


//        while (true) {
//            phones.add(new FeaturePhone("Alcatel"));
//        }

    }

}
