package pl.sda.ludwiczak.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicMain {

    // zmienna long
    // 5 wątków każdy zwiększa zmienną o 1
    // main czeka na wykonanie pracy i wypisuje finalną wartość
    // zmiennej long

    public static void main(String[] args) {

        AtomicLong atomicLong = new AtomicLong();

        Runnable job2 = () -> {
            for (int i = 0; i < 5; i++) {
                // 1st way (zwiększanie o 1)
                atomicLong.getAndIncrement(); // i++, super bezpieczne

                // 2nd way (zwiększanie o 2) - mniej bezpieczne niż getAndIncrement
                long expected;
                do { // zapewnie, że zrobi aż się uda
                    expected = atomicLong.get();
                } while
                (!atomicLong.compareAndSet(expected,expected+2));
            }
        };


        ExecutorService workAndTravel = Executors.newFixedThreadPool(5); // tempo wykonania pracy
        for (int i = 0; i < 50; i++) {
            workAndTravel.execute(job2);

        }
        workAndTravel.shutdown();
        boolean shouldStop = false;

        while (true) {
            try {
                shouldStop = workAndTravel.awaitTermination(1, TimeUnit.MINUTES);
                if (shouldStop) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(atomicLong);
    }

}
