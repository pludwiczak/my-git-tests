package pl.sda.ludwiczak.anonymous_classes.lambda;

@FunctionalInterface
public interface FormulaConvertet {

    double fromCelsiusToFahrenheit(double celsius); // to jest metoda abstrakcyjna

    default double fromFahrToCel(double fahr) { // ta już nie jest abstrakcyjną metodą
        return 0;
    }

}
