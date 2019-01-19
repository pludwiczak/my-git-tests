package pl.sda.ludwiczak.solid.open_close_principle.exc.exception;

public class MyCheckedExc extends Exception { // UserNotFoundCheckedExc

    public MyCheckedExc() {
        // empty
    }

    public MyCheckedExc(String message) {
        super(message);
    }

    public MyCheckedExc(String message, Throwable cause) {
        super(message, cause);
    }

}
