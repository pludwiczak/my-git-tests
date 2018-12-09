//package pl.sda.ludwiczak.null_avoid.Optional;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//
//        Sink sink = new Sink("KOLO");
//        Bathroom withoutSink = new Bathroom(null);
//        Bathroom withSink = new Bathroom(sink);
//        House withBathroomWithSink = new House(withSink);
//        House withBathroomWithoutSink = new House(withoutSink);
//        House withoutBathroom = new House(null);
//
//        displaySinkLabelWithNullCheck(withBathroomWithoutSink);
//
//    }
//
//
//    private static void displaySinkLabelVeryVeryNaive(House house) {
//        String label = house.getBathroom().getSink().getLabel();
//        System.out.println(label);
//    }
//
//
//    private static void displaySinkLabelWithNullCheck(House house) {
//        String label = "default";
//
//        if (null != house) {
//            Bathroom bathroom = house.getBathroom();
//
//            if (null != bathroom) {
//                Sink sink = bathroom.getSink();
//
//                if (null != sink) {
//                    label = sink.getLabel();
//                }
//            }
//
//            System.out.println(label);
//        }
//
//
//        String name = "";
//
//    }
//}
