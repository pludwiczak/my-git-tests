package pl.sda.ludwiczak.thread.interrupting;

import java.time.LocalDate;

public class First implements Runnable {

    @Override
    public void run() {
        while (true)
            System.out.println(LocalDate.now());
    }
}
