package Class19Inheritance;

public class Soccer extends Sport{
    //here we create the second child class of parent class
    String team;
    int numberOfPlayers;

    //here we create the constroctor
    Soccer(String name, String country, String team, int numberOfPlayers){
        super(name, country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;

    }

    //create method of Soccer

    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }

}

