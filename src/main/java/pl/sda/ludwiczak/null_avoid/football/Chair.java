package pl.sda.ludwiczak.null_avoid.football;



public class Chair {

    private Number number;

    public Chair(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }
}
