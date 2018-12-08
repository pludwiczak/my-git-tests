package pl.sda.ludwiczak.generic;


import pl.sda.ludwiczak.animal.Animal;
import pl.sda.ludwiczak.animal.Cat;
import pl.sda.ludwiczak.animal.Dog;
import pl.sda.ludwiczak.equals_and_hashcode.Person;
import sun.java2d.loops.GeneralRenderer;

public class HolderTest {

    public static void main(String[] args) {

        ObjectHolder holder = new ObjectHolder();
        holder.setSecret(new Person("M", "P",35));

        GenericHolder<String> stringHolder = new GenericHolder<>(); // jeżeli zdefiniujemy sobie Stinga, to "E" będzie Stringiem
        stringHolder.setSecret("sekret");
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHolder = new GenericHolder<>();
        personHolder.setSecret(new Person("a", "b",12));
        System.out.println(personHolder.getSecret());


        Home181124<Dog> dogsHome; // podmienia się "Zwierz" na "Dog" w trakcie trwania kompilacji, kod się fizycznie nie zmienia tylko "podmienia" podczas kompilacji
        Home181124<Cat> catsHome;





    }


}
