package pl.sda.ludwiczak.solid.interface_segregation;

public class Main {

    public static void main(String[] args) {

        WashMachine washMachine = new WashMachine(new PolishEngine(new Engine()));

        WashMachine chinease = new WashMachine(new ChineaseWrapperEngine(new ChineaseEngine()));

        WashMachine indian = new WashMachine(new IndianEngineWrapper(new IndianEngine()));

        WashMachine russian = new WashMachine(new RussianWrapperEngine(new RussianEngine()));

    }

}
