package pl.sda.ludwiczak.sorting.car;

import java.util.Comparator;

public class CarPowerComparator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        // 200 - 250
        return o1.getPower() - o2.getPower();
    }
}
