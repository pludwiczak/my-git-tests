package pl.sda.ludwiczak.anonymous_classes.runnable;

public class FabricExample {

    public static void main(String[] args) {
        MyRun one = new MyRun();
        one.run();
        MyRun two = new MyRun();
        two.run();


    }


    private static Runnable makeNewRunnable() {
        return new Runnable() {
            private String name = "Aneta";
            @Override
            public void run() {
                System.out.println("my name is: " + this.name);
            }
        };
    }



}

class MyRun implements Runnable {
    private String name = "Piotr";

    @Override
    public void run() {
        System.out.println("my name is: " + this.name);
    }
}