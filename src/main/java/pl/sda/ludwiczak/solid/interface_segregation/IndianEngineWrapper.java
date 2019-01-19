package pl.sda.ludwiczak.solid.interface_segregation;

public class IndianEngineWrapper implements RunEngine{

    private IndianEngine indianEngine;


    public IndianEngineWrapper(IndianEngine indianEngine) {
        this.indianEngine = indianEngine;
    }

    @Override
    public void start() {
        indianEngine.h1();
        indianEngine.h2();
    }

    @Override
    public void stop() {
        indianEngine.h5();
        indianEngine.h7();
    }
}
