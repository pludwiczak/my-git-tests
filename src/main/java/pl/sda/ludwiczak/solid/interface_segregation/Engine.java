package pl.sda.ludwiczak.solid.interface_segregation;

public class Engine {

    // chcemy, aby speedUp() i slowDown() nie można było używać w pralce


    public void start() {
        System.out.println("start()");
    }

    public void stop() {
        System.out.println("stop()");
    }

    public void speedUp() {
        System.out.println("speedUp()");
    }

    public void slowDown() {
        System.out.println("slowDown()");
    }

}
