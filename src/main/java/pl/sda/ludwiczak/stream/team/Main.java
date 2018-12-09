package pl.sda.ludwiczak.stream.team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Player first = new Player("first", 80, BigDecimal.valueOf(10_000));
        Player ronaldo = new Player("Ronaldo", 90, BigDecimal.valueOf(106_000));
        Player messi = new Player("Messi", 99, BigDecimal.valueOf(105_000));
        Player pogba = new Player("Pogba", 85, BigDecimal.valueOf(10_000));
        Player neymar = new Player("Neymar", 92, BigDecimal.valueOf(150_000));

        Coach smuda = new Coach("Franek", "Smuda", BigDecimal.valueOf(1000_000));
        Coach mourinho = new Coach("Jose", "Mourinho", BigDecimal.valueOf(900_000));
        Coach brzeczek = new Coach("Jurek", "Brzeczek", BigDecimal.valueOf(50_000));
        Coach ferguson = new Coach("Alex", "Ferguson", BigDecimal.valueOf(850_000));
        Coach mocek = new Coach("Slawek", "Mocek", BigDecimal.valueOf(10_000));


        Team allStars = new Team(smuda);
        allStars.setPlayers(Arrays.asList(messi, ronaldo));

        Team krepianka = new Team(mourinho);
        krepianka.setPlayers(Arrays.asList(first, pogba, neymar));

        League japanLeague = new League("Japan League");
        japanLeague.registerTeam(allStars);
        japanLeague.registerTeam(krepianka);


        List<Player> result = getFilteredPlayers(japanLeague, player -> player.getSkill() > 90);
        List<Player> result2 = getFilteredPlayers(japanLeague, player -> player.getNick().startsWith("R"));


        List<Coach> treneiros = new ArrayList<>();
        treneiros.add(smuda);
        treneiros.add(mourinho);
        treneiros.add(brzeczek);
        treneiros.add(ferguson);
        treneiros.add(mocek);

    }


    private static List<Player> getPlayersOldWay(League league) {
        List<Player> result = new ArrayList<>();
        for (Team team : league.getTeamList()) {
//            for (Player player : team.getPlayers()) {
//                result.add(player);
//            }
            result.addAll(team.getPlayers()); // to samo co 3 linie wyzej

        }
        return result;
    }

    private static List<Player> getAllLeaguePlayers(League league) {
        return league
                .getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream()) // flatMap, a nie map, aby sie pozbyc zewnetrznego (zbednego) strumienia
                .collect(Collectors.toList());
    }



/////////////////
    private static List<Player> players = new ArrayList<>();

    private static void getAllLeaguePlayers1(League league) {
        league
                .getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream()) // flatMap, a nie map, aby sie pozbyc zewnetrznego (zbednego) strumienia
                .forEach(player -> players.add(player));
    }
/////////////////



    private static List<Player> getFilteredPlayers(League league, Predicate<Player> predicate) {
        return league
                .getTeamList().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(predicate)
                .collect(Collectors.toList());
    }


    private static Optional<Coach> findTheSpecialOne(List<Coach> coaches) {
        return
                coaches.stream()
                        .filter(coach -> coach.getName().length() == 42)
                        .findFirst();

    }


}