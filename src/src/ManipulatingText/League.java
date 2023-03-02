package ManipulatingText;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player(new StringBuilder("George Eliot"));
        Player player2 = new Player(new StringBuilder("Graham Greene"));
        Player player3 = new Player(new StringBuilder("Geoffrey Chaucer"));


        Player[] players ={player1,player2,player3};

        Team team1 = new Team(new StringBuilder("The Greens"), players);

        //player1.setPlayerName(new StringBuilder("Robert Service"));

        Player player4 = new Player(new StringBuilder("Robert Service"));
        Player player5 = new Player(new StringBuilder("Robbie Burns"));
        Player player6 = new Player(new StringBuilder("Rafael Sabatini"));

        players = new Player[]{player4, player5, player6};

        Team team2 = new Team(new StringBuilder("The Reds"),players);

        Game game1 = new Game(team2, team1);

        Goal goal1 = new Goal(team1, player3, 55);

        game1.setGols(new Goal[]{goal1});

        System.out.println("Goal scored after " + game1.getGols()[0].getGameTime() + " mins by " + game1.getGols()[0].getPlayer() + " of " + game1.getGols()[0].getTeam());


        for (int index = 0; index < game1.getAwayTeam().getPlayers().length; index++) {
            if(game1.getAwayTeam().getPlayers()[index].getPlayerName().toString().contains("Sab")){
                System.out.println("Found " + game1.getAwayTeam().getPlayers()[index].getPlayerName());
                String[] nomes = game1.getAwayTeam().getPlayers()[index].getPlayerName().toString().split(" ");
                System.out.println("Last name is " + nomes[nomes.length-1]);
            }
        }

        for (int index = 0; index < game1.getHomeTeam().getPlayers().length; index++) {
            String[] nomes = game1.getHomeTeam().getPlayers()[index].getPlayerName().toString().split(" ");
            System.out.println(nomes[nomes.length-1] + ", " + nomes[0]);

        }
    }

}