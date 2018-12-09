package pl.sda.ludwiczak.null_avoid.football_with_optional;


import java.util.Optional;

public class Stadion {

    private Chair chair;

    public Stadion(Chair chair) {
        this.chair = chair;
    }

    public Optional<Chair> getChair() {
        return Optional.ofNullable(chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Stadion{" +
                "chair=" + chair +
                '}';
    }


}
