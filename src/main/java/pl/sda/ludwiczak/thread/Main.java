package pl.sda.ludwiczak.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main - beginning");
        System.out.println(Thread.currentThread().getName()); // Thread - pracownik, currentTread - robiący pracownik

        Runnable job = () -> System.out.println("Woker's name: " + Thread.currentThread().getName());

        job.run();

        Thread worker = new Thread(job);

        worker.setName("worker");
        worker.run(); // ta robota została zrobiona na MAINie
        worker.start(); // metoda start -> main wykonuje się od początku do końcu, w pewnym momencie start, co utworzyło drugą równoległą ścieżkę wykonywania

        PwcWorker pwcWorker = new PwcWorker("PwcWorker", job, worker);
        pwcWorker.start();

        Thread indian = new Thread(job);
        indian.setName("beżowy");
        indian.start();
        // indian.start(); // nie można dwa razy zmusić do roboty

        try {
            indian.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        List<String> strings = new ArrayList<>();

        Runnable addingString = () -> {
            synchronized (strings) { // synchronizacja na obiekcie
                strings.add(
                        Thread.currentThread().getName());
            }
        };

        Thread one = new Thread(addingString);
        Thread two = new Thread(addingString);
        Thread three = new Thread(addingString);
        Thread four = new Thread(addingString);
        one.start();
        two.start();
        three.start();
        four.start();
        System.out.println(strings);
        System.out.println("End of main!!!!!!");

        // nie ma gwarancji kolejności wykonywania zadania, nie wiadomo jak długo będzie się wykonywało!!
        // kiedy robota będzie zrobiona? nie wiadomo, tak jak w życiu :)

    }

}
