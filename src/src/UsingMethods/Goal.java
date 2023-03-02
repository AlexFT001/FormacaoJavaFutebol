package UsingMethods;

public class Goal {
    private Team team;
    private Player player;
    private double gameTime;

    public Goal(Team team, Player player, double gameTime){
        this.team = team;
        this.player= player;
        this.gameTime = gameTime;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }
}
