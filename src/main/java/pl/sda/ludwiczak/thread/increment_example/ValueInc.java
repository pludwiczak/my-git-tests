package pl.sda.ludwiczak.thread.increment_example;

public class ValueInc implements Runnable {

    private Holder holder;


    public ValueInc(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        while (true) {
            holder.incrementI();
        }
    }
}
