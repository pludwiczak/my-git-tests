package pl.sda.ludwiczak.anonymous_classes.my_anonymous;

public class Main {

    public static void main(String[] args) {

        Gardener gardener = new Gardener();
        Rose rose = new Rose();

        gardener.processPlant(rose);



        Plant tulip = new Plant() {
            @Override
            public void grow() {
                System.out.println("tulip - grow");
            }

            @Override
            public void smell() {
                System.out.println("tulip - smell");
            }

            @Override
            public void wilt() {
                System.out.println("tulip - wilt");
            }
        };

            gardener.processPlant(tulip);


        Plant opuncja = new Plant() {
            @Override
            public void grow() {
                System.out.println("opuncja - grow");
            }

            @Override
            public void smell() {
                System.out.println("opuncja - smell");
            }

            @Override
            public void wilt() {
                System.out.println("opuncja - wilt");
            }
        };



            gardener.processPlant(opuncja);

    }

}
