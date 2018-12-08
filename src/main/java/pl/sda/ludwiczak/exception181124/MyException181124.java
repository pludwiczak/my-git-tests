package pl.sda.ludwiczak.exception181124;

import pl.com.empas.java_introductory_course.exception.my_exceptions.MyException;

public class MyException181124 extends Exception {

    public MyException181124() {
        //
    }

    public MyException181124(String message) {
        super(message);
    }

    public MyException181124(String message, Throwable cause) {
        super(message, cause);
    }

}
