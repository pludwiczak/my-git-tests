package pl.sda.ludwiczak.exception181124;

public class MyRunTimeExceptionThrower181124 {

    public void throwMyRuntimeException() throws MyRunTimeException181124 {
        System.out.println("throw exc");
        throw new MyRunTimeException181124("haahahahahahah");
    }

}
