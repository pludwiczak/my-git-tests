package pl.sda.ludwiczak.array;

import pl.sda.ludwiczak.animal.Animal;
import pl.sda.ludwiczak.animal.Cat;
import pl.sda.ludwiczak.animal.Dog;

public class ArrayFirstExample {
    public static void main(String[] args) {
        int[] firstArray = new int[4]; // int[] - typ elementu, które będzie zawierała tablica / int[4] - cztery elementy
        firstArray = new int[5]; // firstArray wskazuje teraz na tablicę z 5 elementami, ta z wiersza wyżej (czteroelementowa) dalej istnieje, ale nie ma już jak na nią wskazać

        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        for (int i = 0; i < firstArray.length; i++) { // lenght - zmienna finalna, której nie możemy przestawić
            firstArray[i] = i + 1;
        }


        Animal[] animals = makeAnimals(); // referencja do tablicy zwierząt


//        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i]);
//        }

        for (Animal aaaaaaaa : animals) { // ta sama pętla co powyższa zakomentowana pętla
            System.out.println(aaaaaaaa);
        }


        Animal[] animals1 = new Animal[2];
        animals1[0] = new Dog();
        animals1[1] = new Cat();
        processAnimalArray(animals);

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimalArray(dogs);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat();
        cats[1] = new Cat();
        processAnimalArray(cats);


        addCatToArray(animals1); // pies wypada z indeksu nr 0!
//        addCatToArray(dogs); // nie można dodać kota do psów!!
        addCatToArray(cats);





    }

    public static Animal[] makeAnimals() { // metoda, która tworzy tabelę
        Animal[] result = new Animal[2];
        result[0] = new Dog();
        result[1] = new Cat();
        return result;
    }

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[5];

        for (Object o : objects) { // pętla przegląda wszystkie elementy tabeli
            System.out.println(o);
        }

        for (Dog d : dogs) { // d - pseudo iterator
            System.out.println(d);
        }

        for (Cat c : cats) {
            System.out.println(c);
        }


    }

    public static void processAnimalArray(Animal[] animals) {
        for (Animal animal : animals) {
            animal.whichAnimal();
        }
    }

    public static void addCatToArray(Animal[] cats) {
        cats[0] = new Cat();
    }


}
