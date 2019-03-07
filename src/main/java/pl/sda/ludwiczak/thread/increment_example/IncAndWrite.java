package pl.sda.ludwiczak.thread.increment_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncAndWrite {


    public static void main(String[] args) {
        Holder four = new Holder(4);
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new ValueInc(four));
        service.execute(new ValueWriter(four));
    }


    // 1 wątek incrementuje 10000 razy;
    // 2 wątek wypisuje tę zmienną;


}
