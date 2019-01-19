package pl.sda.ludwiczak.casting;

public class Main {

    public static void main(String[] args) {
        Object object = new String("string");

        // rzutowanie - poruszanie się po drzewie dziedziczenia
        String string = (String) object;

        processAnimal(new Monkey());
        processAnimal(new Elephant());
    }


    public static void processAnimal(Animal animal) {
        animal.makeSound();

        if (animal instanceof Monkey) {
            ((Monkey) animal).jump();
        } else {
            System.out.println("Something else");
        }
    }

}
