package pl.sda.ludwiczak.exception181124;

import pl.com.empas.java_introductory_course.exception.my_exceptions.MyException;

public class ThreeLevelExceptionTest181125 {

    static int counter = 4; // pobawić się counter'em i zobabaczyć jak reaguje program!!!!!!!!!!!!!!!!

    public static void main(String[] args) throws MyException181124 {
        System.out.println("main"); // ostatnia ścieżka, aby obsłużyć wyjątek
        level1(); // będąc w jednej funkcji wywoła się kolejna itp.
        System.out.println("main - before end");
    }


    public static int level1() throws MyException181124 {
        System.out.println("level1");
        try {
            level2();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }

    public static int level2() throws MyException181124 {
        System.out.println("level2");
        try {
            level3();
            System.out.println("level2 - after call to level3");
//        } catch (Exception e) { // z uwagi na polimorfizm, jakikolwiek exception zostałby "złapany", ewentualnie możemy dać jako ostatni catch
//            e.printStackTrace();
        } catch (MyNewException181125 exc) {
            exc.printStackTrace();
        } catch (MyException181124 exception) {
            exception.printStackTrace();
        }

        System.out.println("level2 - before return");
        return 2;
    }

    public static int level3() throws MyException181124, MyNewException181125 { // coś co rzuca wyjątki musi być w "try"; metoda jesli skonczy sie powodzeniem to zwroci 3, a jesli sie nie powiedzie to metode zakonczymy na wyjatku; ścieżka pozytywna (int level3()) a sciezkaa negatywna (throws MyException)
        System.out.println("level3");

        if (counter % 2 == 5) { // % - reszta z dzielenia
            throw new MyException181124("Problem on level 3");
        } else if (counter == 4) {
            throw new MyNewException181125("Problem on level 3 - my new exception");
        }

        System.out.println("level3 - before return");
        return 3;
    }


}
