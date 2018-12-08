package pl.sda.ludwiczak.exception181124;

public class ExceptionExample181124 {
    public static void main(String[] args) throws MyException181124 {

        MyExceptionThrower181124 object = new MyExceptionThrower181124();
//        try {
            object.throwMyException(); // jeśli jest wyjątek, to przechodzimy do catcha, a jeśli nie ma wyjątku to nie przechodzimy do catcha
            System.out.println("here");
//        } catch (MyException181124 myException181124) {
//            myException181124.printStackTrace();
//        }


        System.out.println("here 2");
    }
}
