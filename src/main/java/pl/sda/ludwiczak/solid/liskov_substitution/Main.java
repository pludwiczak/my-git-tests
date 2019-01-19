package pl.sda.ludwiczak.solid.liskov_substitution;

public class Main {

    public static void main(String[] args) {

        final String samsung = "Samsung";
        FeaturePhone samsungFeaturePhone = new FeaturePhone(samsung);
        Smartphone samsungSmart = new Smartphone(samsung);

        System.out.println(samsungSmart.equals(samsungFeaturePhone));
        System.out.println(samsungFeaturePhone.equals(samsungSmart));

    }

}
