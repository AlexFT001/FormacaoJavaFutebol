package CreatingGameDataRandomly;

public class League {
    public static void main(String[] args) {

        Team[] teams = creatTeams();

        //player1.setPlayerName(new StringBuilder("Robert Service"));

        Game game[] = creatGames(teams);

        for (int index = 0; index < game[1-1].getAwayTeam().getPlayers().length; index++) {
            if(game[1-1].getAwayTeam().getPlayers()[index].getPlayerName().toString().contains("Sab")){
                System.out.println("Found " + game[1-1].getAwayTeam().getPlayers()[index].getPlayerName());
                String[] nomes = game[1-1].getAwayTeam().getPlayers()[index].getPlayerName().toString().split(" ");
                System.out.println("Last name is " + nomes[nomes.length-1]);
            }
        }

        for (int index = 0; index < game[1-1].getHomeTeam().getPlayers().length; index++) {
            String[] nomes = game[1-1].getHomeTeam().getPlayers()[index].getPlayerName().toString().split(" ");
            System.out.println(nomes[nomes.length-1] + ", " + nomes[0]);

        }
        System.out.println("\n");

        game[0].getDescription();

    }

    public static Team[] creatTeams(){

        Player player1 = new Player(new StringBuilder("George Eliot"));
        Player player2 = new Player(new StringBuilder("Graham Greene"));
        Player player3 = new Player(new StringBuilder("Geoffrey Chaucer"));


        Player[] players ={player1,player2,player3};

        Team team1 = new Team(new StringBuilder("The Greens"), players);

        Player player4 = new Player(new StringBuilder("Robert Service"));
        Player player5 = new Player(new StringBuilder("Robbie Burns"));
        Player player6 = new Player(new StringBuilder("Rafael Sabatini"));

        players = new Player[]{player4, player5, player6};

        Team team2 = new Team(new StringBuilder("The Reds"),players);

        Team[] teams ={team1, team2};

        return teams;

    }

    public static Game[] creatGames(Team[] teams){

        Game game1 = new Game(teams[2-1], teams[1-1]);

        /*int random = (int) (Math.random()*6);

        Goal[] golos = new Goal[random];

        System.out.println(random);

        Goal goal1 = new Goal(teams[1-1], teams[1-1].getPlayers()[2-1], 55);

        game1.setGols(new Goal[]{goal1});*/

        game1.playGame();

        Game[] games ={game1};
        return games;
    }

}