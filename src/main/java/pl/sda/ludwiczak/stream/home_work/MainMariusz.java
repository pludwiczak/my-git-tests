package pl.sda.ludwiczak.stream.home_work;

import java.util.*;
import java.util.stream.Collectors;

public class MainMariusz {

    public static void main(String[] args) {

        // składniki
        Ingredient nuts = new Ingredient("nuts");
        Ingredient carrots = new Ingredient("carrot");
        Ingredient cocoNut = new Ingredient("coco nuts");
        Ingredient soya = new Ingredient("soya");
        Ingredient water = new Ingredient("water");
        Ingredient waterMellon = new Ingredient("water mellon");

        // napoje
        Beverage first = new Beverage("first",
                Arrays.asList(water, soya, waterMellon));
        Beverage second = new Beverage("second",
                Arrays.asList(water, cocoNut));
        Beverage third = new Beverage("third",
                Arrays.asList(water, nuts, carrots));
        Beverage fourth = new Beverage("fourth",
                Arrays.asList(water, waterMellon, nuts)); // gdy Arrays.asList -> nie można nic już później dodać do listy

        // menu
        Menu menu = new Menu();
        menu.addBeverage(first, true);
        menu.addBeverage(second, false);
        menu.addBeverage(third, true);
        menu.addBeverage(fourth, false);


        System.out.println(getNutsFreeBeverages(menu));

        System.out.println("");

        System.out.println(getFilteredBeverages(menu,nuts));

    }

    // logika
    private static List<Beverage> getNutsFreeBeverages(Menu menu) {
        Ingredient nuts = new Ingredient("nuts");
        List<Beverage> result = new ArrayList<>();

        List<Beverage> withoutNuts = menu.getBeverages()
                .keySet()
                .stream()
                .filter(beverage -> !beverage.getIngredientList().contains(nuts))
                .collect(Collectors.toList());

        Map<Beverage, Boolean> beveragesOverSpecialOffer = menu.getBeverages();
        beveragesOverSpecialOffer.forEach((beverage, aBoolean)
                -> {
            if (aBoolean && withoutNuts.contains(beverage)) {
                result.add(beverage);
            }
        });
        return result;
    }


    private static List<Beverage> getFilteredBeverages(Menu menu, Ingredient unwanted) {

        return menu.getBeverages()
                .entrySet() // "mapa" rozwalona na części
                .stream()
                .filter(beverageBooleanEntry -> beverageBooleanEntry.getValue() == true) // == true <- tego nie trzeba
                .map(beverageBooleanEntry -> beverageBooleanEntry.getKey()) // tu dostajemy klucze tylko do napojów będących w promocji
                .filter(beverage -> !beverage.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());

    }


    private static List<Beverage> getFilteredBeveragesBetterVersion(Menu menu, Ingredient unwanted) {

        return menu.getBeverages()
                .entrySet() // "mapa" rozwalona na części
                .stream()
                .filter(MainMariusz::isSpecialOffer) // == true <- tego nie trzeba
                .map(MainMariusz::changeIntoBeverage) // tu dostajemy klucze tylko do napojów będących w promocji
                .filter(beverage -> getOnlyBeveragesWithoutUnwantedIngredient(beverage,unwanted))
                //.filter(beverage -> !beverage.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());

    }


    private static Beverage changeIntoBeverage(Map.Entry<Beverage, Boolean> entry) { // entry -> w mapie mamy wiele keys i values, a jeden zestaw key i value to entry
        return entry.getKey();
    }


    private static boolean isSpecialOffer(Map.Entry<Beverage,Boolean> entry) {
        return entry.getValue() == true; // == true <- nie trzeba
    }

    private static boolean getOnlyBeveragesWithoutUnwantedIngredient(Beverage beverage, Ingredient unwanted) {
        return !beverage.getIngredientList().contains(unwanted);
    }



}
