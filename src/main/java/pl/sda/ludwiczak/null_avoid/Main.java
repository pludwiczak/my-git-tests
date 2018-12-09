package pl.sda.ludwiczak.null_avoid;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

// never ever write: Optional<String> maybeString;

        Optional<String> maybeString = Optional.empty(); // puste pudełko
        Optional<String> stringForSure = Optional.of("Piotr"); // of - jak jestesmy pewnie, ze nie ma nulla

        if (stringForSure.isPresent()) {
            System.out.println(stringForSure.get());
        }


        String maybeNull = null;
        Optional<String> absentString = Optional.ofNullable(maybeNull);

        if (absentString.isPresent()) {
            System.out.println(absentString.get());
        }






    }


}
