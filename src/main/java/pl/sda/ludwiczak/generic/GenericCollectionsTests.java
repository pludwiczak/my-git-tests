package pl.sda.ludwiczak.generic;

import pl.sda.ludwiczak.animal.Animal;
import pl.sda.ludwiczak.animal.Cat;
import pl.sda.ludwiczak.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionsTests {
    // method takes list of Animals
    // send Dogs and Cats


    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimal(dogs);

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        processAnimals(dogsList);
//        addDog(dogsList);

        List<Animal> animals = new ArrayList<>();
        addDog(animals);



    }

    public static void processAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
//        animals[0] = new Cat(); // nie można tak
    }


    public static void addDog(List<? super Dog> animals) { // możemy dzięki "super": mozna wysyłać od psa w górę, mozna dodawać od psa w dół
        animals.add(new Dog());
    }





    public static void processAnimals(List<? extends Animal> animals) { // w nawiasie ostrym trzeba dodać "? extends", gdy działamy z listami, // może wysłać stąd w dół, NIE MOŻNA DODAWAC // sluzy tylko do przegladania
        for (Animal a : animals) {
            System.out.println(a);
        }
//        animals.add(new Dog());

    }








}
