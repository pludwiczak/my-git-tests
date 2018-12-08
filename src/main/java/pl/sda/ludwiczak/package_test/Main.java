package pl.sda.ludwiczak.package_test;

import pl.sda.ludwiczak.package_test.one.Speaker; // skrótu możemy użyć tylko raz // przezwisko (skrócenie nazwy) w obrębie pliku


public class Main {

    public static void main(String[] args) {
        Speaker one = new Speaker();
        pl.sda.ludwiczak.package_test.two.Speaker two = new pl.sda.ludwiczak.package_test.two.Speaker();
        pl.sda.ludwiczak.package_test.three.Speaker three = new pl.sda.ludwiczak.package_test.three.Speaker();

        one.speak();
        two.speak();
        three.speak();

    }
}
