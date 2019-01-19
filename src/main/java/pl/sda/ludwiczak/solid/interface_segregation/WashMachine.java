package pl.sda.ludwiczak.solid.interface_segregation;

public class WashMachine {

    // chcemy, aby speedUp() i slowDown() nie można było używać w pralce

    private RunEngine engine;

    public WashMachine(RunEngine engine) {
        this.engine = engine;
    }

    public void beginWash() {
        System.out.println("beginWash()");
        engine.start();
    }

    public void endWash() {
        System.out.println("endWash()");
        engine.stop();
    }

}
