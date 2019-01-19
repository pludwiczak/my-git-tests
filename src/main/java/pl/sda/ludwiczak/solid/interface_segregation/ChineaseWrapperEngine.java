package pl.sda.ludwiczak.solid.interface_segregation;

public class ChineaseWrapperEngine implements RunEngine{

    // klasa pośrednia (pomiędzy zwykłą pralką a pralką z Chin??

    private ChineaseEngine chineaseEngine;

    public ChineaseWrapperEngine(ChineaseEngine chineaseEngine) {
        this.chineaseEngine = chineaseEngine;
    }

    @Override
    public void start() {
        chineaseEngine.sfafafasaf();
    }

    @Override
    public void stop() {
        chineaseEngine.safafafhhh();
    }
}
