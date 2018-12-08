package pl.sda.ludwiczak.string_tests;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Mariusz");

        StringBuilder ala2 = new StringBuilder();
        ala2.append("ala");
        ala2.append(" ma");
        ala2.append(" kota2");

        System.out.println(ala2);

        StringBuilder ala3 = new StringBuilder();
        ala3.append("ala")
                .append(" ma")
                .append(" kota3");

        System.out.println(ala3);

        String ala3String = ala3.toString();
        System.out.println(ala3String);

        StringBuilder ala4 = new StringBuilder();
        ala4.append("ala")
                .append(" ma")
                .append(" kota4")
                .replace(4,6, "miała");

        System.out.println(ala4);


    }
}
