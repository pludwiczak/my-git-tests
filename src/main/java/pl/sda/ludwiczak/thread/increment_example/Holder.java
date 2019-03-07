package pl.sda.ludwiczak.thread.increment_example;

public class Holder {

    private volatile int i = 0;

    public Holder(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void incrementI() {
        i++;

    }

}

