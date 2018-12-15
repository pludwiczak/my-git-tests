package pl.sda.ludwiczak.null_avoid;//package pl.sda.ludwiczak.null_avoid.Optional;

import java.util.Optional;

public class Main3 {


    public static void main(String[] args) {

        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathroom = new House(null);

        displaySinkLabelWithNullCheck(withBathroomWithoutSink);

    }


    private static void displaySinkLabelVeryVeryNaive(House house) {
        String label = house.getBathroom().getSink().getLabel();
        System.out.println(label);
    }



private static void displaying(House house) {
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("label: " + s));
}


    private static void displayingShorter(House house) {
        Optional.ofNullable(house)
                .map(House::getBathroom)
                .map(Bathroom::getSink)
                .map(Sink::getLabel)
                .ifPresent(s -> System.out.println("label: " + s));
    }


    private static void displaySinkLabelWithNullCheck(House house) {
        String label = "default";

        if (null != house) {
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom) {
                Sink sink = bathroom.getSink();

                if (null != sink) {
                    label = sink.getLabel();
                }
            }

            System.out.println(label);
        }


        String name = "";

    }
}
