package pl.sda.ludwiczak.thread.increment_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IntIncrementExampleMariusz implements Runnable {

    long i = 5;


    static public void doIt(int a) {
        a++;
    }

    static public void doItOnObject(Object e) {

    }

    public static void main(String[] args) {
        int j = 4;
        doIt(j);
        System.out.println(j);
        Object o = new Object();
        doItOnObject(o);


        ExecutorService service = Executors.newFixedThreadPool(2); // póla pracowników
        IntIncrementExampleMariusz job = new IntIncrementExampleMariusz();
        service.execute(job);
        service.execute(job); // póla wątków
        service.shutdown();


        //1st solution
        while (!service.isTerminated()) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Workers are working...");
        }


        //2nd solution
//        try {
//            service.awaitTermination(1, TimeUnit.HOURS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("From main, i = " + job.i);
    }

    @Override
    public void run() { // to jest JOB
        for (int k = 0; k < 1000; k++) {
            System.out.println("Worker name: " + Thread.currentThread().getName() + " ; Current value of i = " + ++i);
        }
    }
}
