package SoccerLeague_02;

import java.util.Arrays;

public class Team {
    private StringBuilder teamName;
    private Player[] players;

    public Team(StringBuilder teamName, Player[] players){

        this.teamName = new StringBuilder(teamName);
        this.players = players;

    }

    public StringBuilder getTeamName() {
        return teamName;
    }

    public void setTeamName(StringBuilder teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return ""+ teamName;
    }
}
