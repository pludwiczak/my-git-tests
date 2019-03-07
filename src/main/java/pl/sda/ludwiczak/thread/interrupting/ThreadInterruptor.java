package pl.sda.ludwiczak.thread.interrupting;

public class ThreadInterruptor implements Runnable{

    private SyncObject syncObject;

    public ThreadInterruptor(SyncObject syncObject) {
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        syncObject.setShouldContinue(Boolean.FALSE);

    }
}
