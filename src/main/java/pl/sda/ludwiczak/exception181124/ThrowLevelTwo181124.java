package pl.sda.ludwiczak.exception181124;

public class ThrowLevelTwo181124 {

    public void doIt() throws MyException181124 {
        System.out.println("I'm dangerous :)");

        MyExceptionThrower181124 thrower = new MyExceptionThrower181124();
        thrower.throwMyException();
    }

}
