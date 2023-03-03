package UsingConditionals;

public class Game {
    private Team awayTeam;
    private Team homeTeam;
    private Goal[] gols;

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

    public void setGols(Goal[] gols) {
        this.gols = gols;
    }

    public  void getDescription(){
        System.out.println(this.awayTeam + " vs." + homeTeam);
        for (int index = 0; index < gols.length; index++) {
            System.out.println(gols[index]);
        }
        StringBuilder winnigTeam = new StringBuilder();
        int goalsHomeTeam = 0;
        int goalAwayTeam = 0;
        Boolean tie = true;
        for (int index = 0; index < this.gols.length ; index++) {
            if(this.gols[index].getTeam() == this.homeTeam){
                goalsHomeTeam++;
            } else {
                goalAwayTeam++;
            }
        }

        this.homeTeam.incGoalsTotal(goalsHomeTeam);
        this.awayTeam.incGoalsTotal(goalAwayTeam);

       if(goalsHomeTeam > goalAwayTeam){
            winnigTeam = new StringBuilder(this.homeTeam.getTeamName());
            this.homeTeam.incPointsTotal(2);
            tie = false;
        } else if(goalAwayTeam > goalsHomeTeam) {
            winnigTeam = new StringBuilder(this.awayTeam.getTeamName());
            this.awayTeam.incPointsTotal(2);
            tie = false;
        }
        if(!tie) {
            System.out.println(winnigTeam + " win (" + goalAwayTeam + " - " + goalsHomeTeam + ")");
        } else {
            System.out.println("Tie");
            this.awayTeam.incPointsTotal(1);
            this.homeTeam.incPointsTotal(1);
        }
    }

    public void playGame(){
        int random = (int) (Math.random()*6);
        Goal[] golos = new Goal[random];

        for (int index = 0; index < golos.length ; index++) {
            int team = (int) (Math.random() * 2);
            int player = (int) (Math.random() * 3);
            int gameTime = (int) (Math.random() * 90);

            if (team == 1) {
                Goal goal = new Goal(getAwayTeam(), getAwayTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            } else {
                Goal goal = new Goal(getHomeTeam(), getHomeTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            }
        }
        setGols(golos);


    }

    public void playGame(int numero){

        Goal[] golos = new Goal[numero];

        for (int index = 0; index < golos.length ; index++) {
            int team = (int) (Math.random() * 2);
            int player = (int) (Math.random() * 3);
            int gameTime = (int) (Math.random() * 90);

            if (team == 1) {
                Goal goal = new Goal(getAwayTeam(), getAwayTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            } else {
                Goal goal = new Goal(getHomeTeam(), getHomeTeam().getPlayers()[player], gameTime);
                golos[index] = goal;
            }
        }
        setGols(golos);


    }
}
