package pl.sda.ludwiczak.anonymous_classes.lambda.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSorter {

    public static List<Car> sortCarsByModel(Car first, Car second, Sorter sorter) { // metoda ma brać pojazdy i zwrócić je w liście
        List<Car> result = new ArrayList<>();

        int order = sorter.sort(first.getModel(),second.getModel());

        if (order < 0) {
            result.add(first);
            result.add(second);
        }
        else
        {
            result.add(second);
            result.add(first);
        }

        return result;
    }

}
