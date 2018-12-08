package pl.sda.ludwiczak.anonymous_classes.runnable;

// nowa klasa, ktore implementuje Runnable
// klasa anonimowa
// 4 x -> "zwyczajnie", "anonimowa", anonimowa przekazana jako parametr, lambda

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable");
    }
}

public class Main {

    public static void main(String[] args) {

        // klasa anonimowa
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("my anonymous Runnable");
            }
        };
        runnable.run();
        processRunnable(runnable);


        // klasa anonimowa - przekazana jako parametr
        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("something different");
            }
        });


// lambda z zachowaniem referencji
        Runnable runnableLambda = () -> System.out.println("my runnable lambda");
        processRunnable(runnableLambda);
// lambda
        processRunnable(() -> System.out.println("lambda"));




// zwyczajnie
        MyRunnable run = new MyRunnable();
        run.run();
    }

    private static void processRunnable(Runnable runnable) {
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();
    }
}