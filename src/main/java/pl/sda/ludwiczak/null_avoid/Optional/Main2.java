package pl.sda.ludwiczak.null_avoid.Optional;

import pl.sda.ludwiczak.null_avoid.Bathroom;
import pl.sda.ludwiczak.null_avoid.House;
import pl.sda.ludwiczak.null_avoid.Sink;

import java.util.Optional;

public class Main2 {


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

// 1. wersja
        absentString.ifPresent(x -> System.out.println(x));


// 2. wersja tego co bylo wyzej
//        if (absentString.isPresent()) {
//            System.out.println(absentString.get());
//        }


    }


    // poniżej nieczytelne
        public static void printLabelWithLambda1(pl.sda.ludwiczak.null_avoid.Optional.House house) {
        Optional.ofNullable(house)
                .ifPresent(house1 -> house1.getBathroom().
                        ifPresent(bathroom -> bathroom.getSink().
                                ifPresent(sink ->
                                        System.out.println(sink.getLabel()))));
        }


        // poniżej bardziej czytelne...
        public static void printLabelWithLambda(pl.sda.ludwiczak.null_avoid.Optional.House house) {
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: " + s));
        }

        // ...i jeszcze bardziej
        public static void printLabelWithLambda2(pl.sda.ludwiczak.null_avoid.Optional.House house) {
        Optional.ofNullable(house)
                .flatMap(pl.sda.ludwiczak.null_avoid.Optional.House::getBathroom)
                .flatMap(pl.sda.ludwiczak.null_avoid.Optional.Bathroom::getSink)
                .map(pl.sda.ludwiczak.null_avoid.Optional.Sink::getLabel)
                .ifPresent(s -> System.out.println("label: " + s));
        }



    private static void printLabelSlowMode(pl.sda.ludwiczak.null_avoid.Optional.House house) {
        String label = "empty";

        Optional<pl.sda.ludwiczak.null_avoid.Optional.House> maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()) {
            Optional<pl.sda.ludwiczak.null_avoid.Optional.Bathroom> maybeBathroom = maybeHouse.get().getBathroom();

            if (maybeBathroom.isPresent()) {
                Optional<pl.sda.ludwiczak.null_avoid.Optional.Sink> maybeSink = maybeBathroom.get().getSink();

                if (maybeSink.isPresent()) {
                    label = maybeSink.get().getLabel();
                }
            }
        }
        System.out.println("label: " + label);
    }

}
