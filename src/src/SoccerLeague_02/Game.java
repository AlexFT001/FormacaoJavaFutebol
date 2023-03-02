package SoccerLeague_02;

import java.sql.Array;

public class Game {
    private Team awayTeam;
    private Team homeTeam;
    private SoccerLeague_02.Goal[] gols;

    public Game(Team awayTeam, Team homeTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.gols = null;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Goal[] getGols() {
        return gols;
    }

    public void setGols(SoccerLeague_02.Goal[] gols) {
        this.gols = gols;
    }
}
