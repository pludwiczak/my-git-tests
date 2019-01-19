package pl.sda.ludwiczak.stream.home_work;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    Map<Beverage, Boolean> beverages = new LinkedHashMap<>();

    public void addBeverage(Beverage beverage,
                            Boolean specialOffer) {
        beverages.put(beverage,specialOffer);
    }

    public Map<Beverage, Boolean> getBeverages() {
        return beverages;
    }
}
