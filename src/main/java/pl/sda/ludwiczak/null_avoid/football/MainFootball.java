package pl.sda.ludwiczak.null_avoid.football;


// FootballClub -> nie jest nullem Stadion -> Chair -> Number
// stary - nie ma optional
// nowy - chair i number optionala

import java.util.Optional;

public class MainFootball {


    private static void getChairNumber(FootballClub footballClub) {
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadion())
                .map(stadion -> stadion.getChair())
                .map(chair -> chair.getNumber())
                .map(number -> number.getNumber())
                .ifPresent(integer -> System.out.println("Number: " + integer));
    }

    private static void getChairNumberAnotherDisplaying(FootballClub footballClub) {
        Optional.ofNullable(footballClub)
                .map(FootballClub::getStadion)
                .map(Stadion::getChair)
                .map(Chair::getNumber)
                .map(Number::getNumber)
                .ifPresent(integer -> System.out.println("Number: " + integer));
    }


}
