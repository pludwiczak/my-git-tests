package pl.sda.ludwiczak.thread.join;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main - starts");

        Runnable job = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(String.format("i = [%d], run by: [%s]", i, Thread.currentThread().getName()));
            }
        };

        Thread worker = new Thread(job);
//        worker.setDaemon(true); // zobacz jak działa program, gdy (za/od)komentujesz tę linię, po co Daemon? przerywa wątki?
        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);

        worker.start(); // start stworzył nowy wątek!!
        worker2.start();
        worker3.start();



        try {
            worker.join();
            worker2.join();


//            Thread.sleep(25); // dajemy jakiś czas na wykonanie
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("Main - ends");
    }

}
