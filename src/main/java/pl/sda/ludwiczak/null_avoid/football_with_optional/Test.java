package pl.sda.ludwiczak.null_avoid.football_with_optional;

import java.util.Optional;

public class Test {

private static void getNumber(FootballClub footballClub) {
    Optional.ofNullable(footballClub)
            .map(footballClub1 -> footballClub1.getStadion())
            .flatMap(stadion -> stadion.getChair())
            .map(chair -> chair.getNumber())
            .map(number -> number.getNumber())
            .ifPresent(integer -> System.out.println("integer: " + integer));

}

}
