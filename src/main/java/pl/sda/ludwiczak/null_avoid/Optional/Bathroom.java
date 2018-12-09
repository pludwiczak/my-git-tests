package pl.sda.ludwiczak.null_avoid.Optional;

import java.util.Optional;

public class Bathroom {

    private Sink sink;

    public Bathroom(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "sink=" + sink +
                '}';
    }

    public Optional<Sink> getSink() { // inaczej niż w pakiecie wyzej
        return Optional.ofNullable(sink);  }

    public void setSink(Sink sink) {
        this.sink = sink;
    }
}
