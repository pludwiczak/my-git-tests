package pl.sda.ludwiczak.thread.increment_example;

public class ValueWriter implements Runnable {

    private Holder holder;

    public ValueWriter(Holder holder) {
        this.holder = holder;
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(holder.getI());
        }
    }
}
