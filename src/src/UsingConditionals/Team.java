package UsingConditionals;

public class Team {
    private StringBuilder teamName;
    private Player[] players;
    private int totalPoints;

    private int goals;

    public Team(StringBuilder teamName){
        this.teamName = teamName;
        this.players = null;
    }
    public Team(StringBuilder teamName, Player[] players){

        this.teamName = new StringBuilder(teamName);
        this.players = players;

    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGoals() {
        return goals;
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

    public void incPointsTotal(int incPoints){
        this.totalPoints += incPoints;
    }
    public  void incGoalsTotal(int goal){
        this.goals+= goal;
    }

    @Override
    public String toString() {
        return ""+ teamName;
    }

}
