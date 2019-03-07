package pl.sda.ludwiczak.finalize;

import java.lang.ref.WeakReference;

public class Main {

    // ulubiona klasa
    // nadpisać metodę finalize
    // utworzyć 100 obiektów i zobaczyć
    // czy zostaną sprzątniete
    // System.gc();
    public static void main(String[] args) {

        Person p = new Person("M", "P");
        Person p2 = p;
        WeakReference<Person> maybePerson = new WeakReference<>(p);
        maybePerson.get();
        p = null;
        maybePerson.get();

        System.out.println(p);
        System.out.println(p2);
    }
}