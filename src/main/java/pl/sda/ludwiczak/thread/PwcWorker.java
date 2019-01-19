package pl.sda.ludwiczak.thread;

public class PwcWorker extends Thread {

    private Runnable jobToDo;
    private Thread afterThis;

    public PwcWorker(String name, Runnable jobToDo, Thread afterThis) {
        super(jobToDo);
        setName(name);
        this.jobToDo = jobToDo;
        this.afterThis = afterThis;
    }

    @Override
    public synchronized void start() { // tę metodę może wykonywać tylko jeden wątek !!!!
        try {
            afterThis.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.start();
    }
}
