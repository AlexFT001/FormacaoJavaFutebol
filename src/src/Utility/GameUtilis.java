package Utility;

import CreatingGameDataRandomly.Game;
import CreatingGameDataRandomly.Goal;

public class GameUtilis {

    public static  void addGamesGoals(Game game){
        int random = (int) (Math.random()*6);
        Goal[] golos = new Goal[random];

        for (int index = 0; index < golos.length ; index++) {
            int team = (int) (Math.random() * 2);
            int player = (int) (Math.random() * 3);
            int gameTime = (int) (Math.random() * 90);

            if (team == 1) {
                Goal goal = new Goal(game.getAwayTeam(), game.getAwayTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            } else {
                Goal goal = new Goal(game.getHomeTeam(), game.getHomeTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            }
        }

        game.setGols(golos);

    }
}
