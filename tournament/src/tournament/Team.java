package tournament;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Team(){
        setPlayers(new ArrayList<>());
        setName("");
    }

    public Team(String name) {
        setPlayers(new ArrayList<>());
        setName(name);
    }

    private Team(ArrayList<Player> players) {
        setPlayers(players);
        setName("");
    }

    public Team(String name, ArrayList<Player> players) {
        setName(name);
        setPlayers(players);
    }
}
