package pl.sda.ludwiczak.gogo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GogoClub {

    // 10 wątków
    // każdy ma referencję do countdownlatch
    // każde "uderza" (.countDown) raz i próbuje iść
    // dalej, ale nie może (.await)
    // po piątym gongu wszyscy idą dalej

    public static void main(String[] args) {

        CountDownLatch badGuy = new CountDownLatch(5);

        Runnable partyGuy = () -> {
            System.out.println("Kick bad guy!!!");
            badGuy.countDown();
            try {
                badGuy.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Bad guy is down from " + Thread.currentThread().getName());

        };

        ExecutorService gogo = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            gogo.execute(partyGuy);
        }
        gogo.shutdown();



//        Runnable firstGong = () -> badGuy.countDown();
//        Runnable secondGong = () -> badGuy.countDown();
//        Runnable thirdGong = () -> badGuy.countDown();
//        Runnable fourthGong = () -> badGuy.countDown();
//        Runnable fifthGong = () -> badGuy.countDown();
//        Runnable sixthGong = () -> badGuy.countDown();
//
//        Thread gonger1 = new Thread(firstGong);
//        Thread gonger2 = new Thread(secondGong);
//        Thread gonger3 = new Thread(thirdGong);
//        Thread gonger4 = new Thread(fourthGong);
//        Thread gonger5 = new Thread(fifthGong);
//        Thread gonger6 = new Thread(sixthGong);
//
//        gonger1.start();
//        gonger2.start();
//        gonger3.start();
//        gonger4.start();
//        gonger5.start();
//        gonger6.start();


    }

}
