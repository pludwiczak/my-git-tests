package pl.sda.ludwiczak.thread.interrupting;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        SyncObject syncObject = new SyncObject();
        Runnable dateTimePrinter = new DateTimePrinter(syncObject);
        Runnable interruptor = new ThreadInterruptor(syncObject);

        ExecutorService workAndTravel = Executors.newFixedThreadPool(2);
        workAndTravel.execute(dateTimePrinter);
        workAndTravel.execute(interruptor);
        workAndTravel.shutdown();

    }

}
