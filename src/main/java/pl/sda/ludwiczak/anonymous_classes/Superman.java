package pl.sda.ludwiczak.anonymous_classes;

public class Superman implements Moveable {


    @Override
    public void run() {
        System.out.println("RUN superman");
    }

    @Override
    public void fly() {
        System.out.println("FLY superman");
    }
}
