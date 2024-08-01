// 5. Write two DTO classes to exhibit the has-a relationship given in the diagram. https://cdn-proxy.slickplan.com/wp-content/uploads/2023/10/8_uml.png

class Team{
    public String name;
    public String city;
    public String division;
    public Player player;

    public Team(String name, String city, String division,Player player) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.player=player;
    }

    public void playGame(){
        System.out.println("Team Details"+"\nTeam Name : "+name+"\n");
        System.out.println(player.name+" jerseyNumber "+ player.jerseyNumber+"position "+ player.position+ " started game in "+city + ","+division+"division.");
    }

    public void hireCoach(){
        System.out.println("Couch hired...");
    }
}

class Player{
    public String name;
    public String position;
    public int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public void train(){
        System.out.println("workout started...");
    }
}
class Game {
    public static void main(String[] args) {
        Player player=new Player("Saran","Attacker",63);
        Team team=new Team("Trichy Blasters","kumbakonam","Trichy",player);
        player.train();
        team.hireCoach();
        team.playGame();
    }
}