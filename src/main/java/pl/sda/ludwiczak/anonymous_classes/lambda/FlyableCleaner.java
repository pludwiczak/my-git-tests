package pl.sda.ludwiczak.anonymous_classes.lambda;

public class FlyableCleaner {

        public void clean(Flyable flyable) { // metoda przyjmuje coś typu flyable
            System.out.println("Cleaning flyable");
        }

        public void clean(Swimmable swimmable) { // metoda przyjmuje coś typu flyable
            System.out.println("Cleaning swimmable");
        }

}
