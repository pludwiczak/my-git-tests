package pl.sda.ludwiczak.solid.open_close_principle;

public class SaveToFile implements Saver<BetterSecret> {

    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving to file... ");
    }
}
