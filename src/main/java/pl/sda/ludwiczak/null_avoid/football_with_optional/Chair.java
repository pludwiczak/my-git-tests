package pl.sda.ludwiczak.null_avoid.football_with_optional;


public class Chair {

    private Number number;

    public Chair(Number number) {
        this.number = validate(number);
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = validate(number);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }


    private Number validate(Number number) {
        if (null == number) {
            throw new IllegalArgumentException("Number cannot be null!");
        }

        return number;
    }


}
