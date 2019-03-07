package pl.sda.ludwiczak.thread.notify.priority;

public class Main {

    // 2 Runnable (robota, a Thread - robotnik) - każdy pisze coś innego - lambda
    // i czeka 500 ms
    // 2 Thread - 2 obiekty - skrajny priorytet 1 i 10
    // zaobserwujmy wyjście


    public static void main(String[] args) {

        Runnable firstJob = () -> {
            while (true) {
                System.out.println("first job");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable secondJob = () -> {
            while (true) {
                System.out.println("second job");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread worker1 = new Thread(firstJob);
        worker1.setPriority(Thread.MIN_PRIORITY);

        Thread worker2 = new Thread(secondJob);
        worker2.setPriority(Thread.MAX_PRIORITY);

        Thread worker3 = new Thread(firstJob);
        worker1.setPriority(Thread.MIN_PRIORITY);

        Thread worker4 = new Thread(secondJob);
        worker2.setPriority(Thread.MAX_PRIORITY);

        Thread worker5 = new Thread(firstJob);
        worker1.setPriority(Thread.MIN_PRIORITY);

        Thread worker6 = new Thread(secondJob);
        worker2.setPriority(Thread.MAX_PRIORITY);

        Thread worker7 = new Thread(firstJob);
        worker1.setPriority(Thread.MIN_PRIORITY);

        Thread worker8 = new Thread(secondJob);
        worker2.setPriority(Thread.MAX_PRIORITY);

        Thread worker9 = new Thread(firstJob);
        worker1.setPriority(Thread.MIN_PRIORITY);

        Thread worker10 = new Thread(secondJob);
        worker2.setPriority(Thread.MAX_PRIORITY);


//        for (int i = 0; i < 5; i++) {
//            Thread toStart = new Thread(firstJob);
//            toStart.setPriority(Thread.MIN_PRIORITY);
//            toStart.start();
//        }


        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
        worker6.start();
        worker7.start();
        worker8.start();
        worker9.start();
        worker10.start();

    }
}
