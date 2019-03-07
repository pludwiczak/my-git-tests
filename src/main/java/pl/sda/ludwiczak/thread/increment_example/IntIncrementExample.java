package pl.sda.ludwiczak.thread.increment_example;

public class IntIncrementExample extends Thread implements Runnable {

    // TODO
    // 2 wątki - Thread
    // każdy incrementuje liczbę 1000 razy
    // wątek main wypisuje ją

    private int[] value;

    public IntIncrementExample(int[] value) {
        this.value = value;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.value[0]++;
            System.out.println(this.value[0]);
        }
    }


}
