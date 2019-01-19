package pl.sda.ludwiczak.thread.join;

public class MainMariusz {

    public static void main(String[] args) {
        System.out.println("main() - beginning");

        Runnable job = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(String.format("i = [%d], run by: [%s]",
                        i, Thread.currentThread().getName()));
            }
        };

        Thread worker = new Thread(job);
//        worker.setDaemon(true);
        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);


        worker.start();
        worker2.start();
        worker3.start();
        try {
            worker.join(); // jest ryzyko, że jak się będziemy chcili podłączyć do wątku, który już jest dead, to się wywalimy
            worker2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            Thread.sleep(1500);
            worker3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main() - end");
    }

}
