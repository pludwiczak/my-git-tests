package pl.sda.ludwiczak.exception181124;

public class MyRunTimeExceptionTest181125 {

    // 3 levels
    // level 3 - throw MyRunTimeException
    // catch in maim()

    public static void main(String[] args) {
        try {
            level1();
        } catch (MyRunTimeException181124 exc) {
            exc.printStackTrace();
        }
    }

    public static void level1() {
        level2();
    }

    public static void level2() {
        level3();
    }

    public static void level3() throws MyRunTimeException181124 { // gdy mamy RunTimeException, to nie trzeba dodawac, ale dobra praktyka mowi, aby pisac przy metodach
        throw new MyRunTimeException181124();
    }

}
