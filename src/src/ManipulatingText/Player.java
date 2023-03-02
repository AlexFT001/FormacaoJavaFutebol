package ManipulatingText;

public class Player {

    private StringBuilder playerName;

    public Player(StringBuilder playerName){
        this.playerName = new StringBuilder(playerName);
    }

    public StringBuilder getPlayerName() {
        return playerName;
    }

    public void setPlayerName(StringBuilder playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return ""+ playerName;
    }
}
