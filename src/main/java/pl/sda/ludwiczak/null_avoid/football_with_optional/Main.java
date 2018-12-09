package pl.sda.ludwiczak.null_avoid.football_with_optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    }

    private static void printChairNumber(FootballClub footballClub) {
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadion())
                .flatMap(stadion -> stadion.getChair()) // Chair jest opcjonalne, dlatego flatMap
                .map(chair -> chair.getNumber())
                .map(number -> number.getNumber())
                .ifPresent(integer -> System.out.println("Number: " + integer)); // integer lub dowolna inna nazwa

    }

}
