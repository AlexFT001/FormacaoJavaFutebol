package SoccerLeague;

public class Game {
    private Team awayTeam;
    private Team homeTeam;
    private Goal[] gols;

    public Game(Team awayTeam, Team homeTeam, Goal[] gols) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.gols = gols;
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

    public void setGols(Goal[] gols) {
        this.gols = gols;
    }
}
