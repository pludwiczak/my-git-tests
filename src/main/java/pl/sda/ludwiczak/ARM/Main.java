package pl.sda.ludwiczak.ARM;

public class Main {

    public static void main(String[] args) {
        mustBeClose();
    }

    private static void mustBeClose() {
        try (MyOwnClosable myOwnClosable = new MyOwnClosable()) {

        }
    }
}

