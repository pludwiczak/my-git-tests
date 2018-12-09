package pl.sda.ludwiczak.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("Poland", 40_000_000, 312, 5_000),
                new Country("Russia", 40_000_000, 22312, 3_000),
                new Country("China", 1_400_000_000, 11312, 4_000),
                new Country("Ukraine", 1_000, 1112, 5_000),
                new Country("Holland", 20_000_000, 112, 15_000),
                new Country("Spain", 50_000_000, 412, 11_000)

        );


        List<Country> result = genericFilter(countries,country -> country.getAveragePayCheck() > 10_000);


        // stary sposób
        for (Country country : result) {
            System.out.println(country);
        }

        // nowy sposób
        result.forEach(country -> System.out.println(country));

    }


    private static List<Country> filterByMinimalPeopleNumber(List<Country> countries, long minimalPeopleNumber) { // o strumieniach będzie poniżej
        return countries.stream()
                .filter(country -> country.getNumberOfPeople() > minimalPeopleNumber) // wyrzuca kraje, które nie przeszły pierwszego warunku
                .collect(Collectors.toList());
    }




    private static List<Country> genericFilter(List<Country> countries, Predicate<Country> predicate) {
        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }



    private List<Country> getListOfRichCountries(List<Country> countries, double minimalPayCheck) {
        List<Country> result = new ArrayList<>();

        for (Country country : countries) {
            if (country.getAveragePayCheck() >= minimalPayCheck) {
                result.add(country);
            }
        }

        return result;
    }

    private List<Country> getListOfBigCountries(List<Country> countries, long minimalNumberOfPeople) {
        List<Country> result = new ArrayList<>();

        for (Country country : countries) {
            if (country.getNumberOfPeople() >= minimalNumberOfPeople) {
                result.add(country);
            }
        }

        return result;
    }


}
