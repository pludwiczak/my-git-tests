package pl.sda.ludwiczak.ARM;

public class MyOwnClosable implements AutoCloseable {

    private boolean canUse = true;

    public void close() {
        System.out.println("Calling close() method");
        canUse = false;
    }

}
