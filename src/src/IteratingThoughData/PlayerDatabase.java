package IteratingThoughData;

import java.sql.Array;
import java.util.StringTokenizer;

public class PlayerDatabase {
    private Player[] players;
    private static  String nomes = "George Eliot, Graham Greene, Geoffrey Chaucer, Robert Service, Robbie Burns, Rafael Sabatini";

    public PlayerDatabase(){
        StringTokenizer token = new StringTokenizer(",");
        while(token.hasMoreTokens()){
            int i = 0;
            Player player = new Player(new StringBuilder(token.nextToken()));
            this.players[i] = player;
            i++;
        }
    }

    public Player[] getTeam(int numberPlayers){
        Player[] askPlayers = new Player[numberPlayers];
        askPlayers = this.players;
        return  askPlayers;
    }
}
