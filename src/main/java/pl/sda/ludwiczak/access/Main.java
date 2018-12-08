package pl.sda.ludwiczak.access;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Piotr", "Ludwiczak", -20);
        System.out.println(me);
        me.setAge(-50);
        System.out.println(me);
//        me.age = -50;
//        System.out.println(me);
        me.secret = "my secret";
        me.secondSecret = "my second secret";
    }

}
