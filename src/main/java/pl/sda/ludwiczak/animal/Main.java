package pl.sda.ludwiczak.animal;

public class Main {

    public static void main(String[] args) {
        Dog szarik = new Dog();
        szarik.whichAnimal();
        szarik.makeSound();




        Animal maybeDog = new Dog();
        Animal maybeCat = new Cat();



        maybeDog.whichAnimal();
//        maybeDog.makeSound();



        Animal maybeMonkey = new Monkey();
        Object monkey = new Monkey();


    }
}
