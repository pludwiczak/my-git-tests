package pl.sda.ludwiczak.equals_and_hashcode;

public class Main {
    public static void main(String[] args) {

        Person me = new Person("Piotr", "L", 29);
        Person piotrek = me;

        System.out.println("me.equals(piotrek): " + me.equals(piotrek));

        System.out.println("me == piotrek? : " + (me == piotrek));


        piotrek = new Person("Piotr", "L", 29);
        System.out.println("and now, me == piotrek? : " + (me == piotrek));

//      teraz poniżej będziemy sprawdzali czy zawartości są takie same

        System.out.println("me.equals(piotrek): " + me.equals(piotrek));




    }
}
