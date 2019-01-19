package pl.sda.ludwiczak.sorting;

public class NameComparing {

    public static int comparePersonsByName(Person first, Person second) {

        return first.getName().compareTo(second.getName());
    }

}
