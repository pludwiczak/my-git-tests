package pl.sda.ludwiczak.exception181124;

public class MyExceptionThrower181124 {

    public void throwMyException() throws MyException181124 { // nazywa się tak, nic nie zwraca, nic nie przyjmuje, rzuca wyjątkami
        System.out.println("throwMyException()");
        throw new MyException181124();
//        System.out.println("???"); // jak linię wyżej wyrzuca błąd, to nie można tu nic dać

    }
}
