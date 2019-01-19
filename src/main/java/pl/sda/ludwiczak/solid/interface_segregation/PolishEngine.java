package pl.sda.ludwiczak.solid.interface_segregation;

public class PolishEngine implements RunEngine {

    private Engine engine;

    public PolishEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }
}
