package pl.sda.ludwiczak.anonymous_classes;

public class Main {

    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal parrot = new Animal() { // nie ma klasy Parrot, a chcemy mieć Parrot na jeden raz
            // coś co dziedziczy po Animal, nieważne jaka to jest klasa, klasa jest anonimowa dla nas (dla Javy nie),
            @Override
            public void printAnimalName() {
                System.out.println("Parrot");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck");
            }

            public void makeSound() { // do klasy anonimowej można dodawać metody
                System.out.println("kwa kwa");
            }
        };

        // żeby wywołać metodę dodaną do klasy anonimowej, to zeby wywolac metode, trzeba napisac ponizszy kod
//        new Animal() {
//            @Override
//            public void printAnimalName() {
//                System.out.println("Duck");
//            }
//
//            public void makeSound() { // do klasy anonimowej można dodawać metody
//                System.out.println("kwa kwa");
//            }
//        }.makeSound();


        Monkey monkey1 = new Monkey() { // tworzymy anonomiwą klasę, która dziedziczy po Monkey
            @Override
            public void printAnimalName() {
                System.out.println("Gorilla");
            }
        };



        AnimalProcessor processor = new AnimalProcessor();
        processor.processAnimal(monkey);
        processor.processAnimal(parrot);
        processor.processAnimal(duck);
        processor.processAnimal(new Animal() {
            @Override
            public void printAnimalName() {
                System.out.println("Duck2");
            }
        });

        ShowSecret showSecret = new ShowSecret() {
            @Override
            public void printSecret() {

            }
        };

        SecretProcessor secretProcessor = new SecretProcessor();
        secretProcessor.processSecret(new ShowSecret() {
            @Override
            public void printSecret() {
                System.out.println("Sekret2");
            }
        });


        Moveable moveable = new Moveable() {
            @Override
            public void run() {
                System.out.println("RUN1");
            }

            @Override
            public void fly() {
                System.out.println("RUN2");
            }
        };

        ////////////////////////////


        MoveableProcessor moveableProcessor = new MoveableProcessor();

        // Superman superman = new Superman();


        moveableProcessor.processMoveable(new Moveable() {
            @Override
            public void run() {
                System.out.println("RUN");
            }

            @Override
            public void fly() {
                System.out.println("FLY");
            }
        });



    }

}