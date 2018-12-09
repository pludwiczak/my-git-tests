package pl.sda.ludwiczak.null_avoid.football_with_optional;

public class FootballClub {

    private Stadion stadion;

    public FootballClub(Stadion stadion) {
        this.stadion = validate(stadion);  // dodane validate
    }

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = validate(stadion); // dodane validate
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadion=" + stadion +
                '}';
    }


    private Stadion validate(Stadion stadion) {
        if (null == stadion) {
            throw new IllegalArgumentException("Stadion cannot be null!");
        }

        return stadion;
    }

}
