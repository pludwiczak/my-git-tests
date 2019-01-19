package pl.sda.ludwiczak.solid.open_close_principle;

public interface Saver<T> { // dodaliśmy <T> bo jeśli ta sama metoda dla różnych typów, to generyk

    void save(T secret);

}
