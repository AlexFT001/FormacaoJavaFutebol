package SoccerLeague;

import java.util.Arrays;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player(new StringBuilder("George Eliot"));
        Player player2 = new Player(new StringBuilder("Graham Greene"));
        Player player3 = new Player(new StringBuilder("Geoffrey Chaucer"));

        Player[] players ={player1,player2,player3};

        Team team1 = new Team(new StringBuilder("The Greens"), players);

        //player1.setPlayerName(new StringBuilder("Robert Service"));

        for (int i = 0; i < players.length ; i++) {
            System.out.println(team1.getPlayers()[i]);
        }

        Player player4 = new Player(new StringBuilder("Robert Service"));
        Player player5 = new Player(new StringBuilder("Robbie Burns"));
        Player player6 = new Player(new StringBuilder("Rafael Sabatini"));

        players = new Player[]{player4, player5, player6};

        Team team2 = new Team(new StringBuilder("The Reds"),players);

        for (int i = 0; i < players.length ; i++) {
            System.out.println(team2.getPlayers()[i]);
        }



    }
}