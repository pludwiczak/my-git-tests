package pl.sda.ludwiczak.data_type.enum_example;

public class Main {
    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;

        System.out.println(maybeSummer.name());


//        maybeSummer = Seasons.AUTUMN;
//
//        System.out.println(maybeSummer.name());

        System.out.println(maybeSummer.ordinal()); // .ordinal - nr indeksu / na ".ordinal" nie powinniśmy bazować, bo ktoś może zmienić kolejność i refenrecja może do czegoś innego się odwoływać

    }
}
