package pl.sda.ludwiczak.thread.interrupting;

import java.time.LocalDateTime;

public class DateTimePrinter implements Runnable {

    private SyncObject syncObject;

    public DateTimePrinter(SyncObject syncObject) {
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        Boolean shouldContinue = syncObject.getShouldContinue();

        // bad solution
        while (shouldContinue) {
//        while (syncObject.getShouldContinue()) {
            System.out.println(LocalDateTime.now());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
