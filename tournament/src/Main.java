import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player teacher = new Player("Teacher");
        Player student1 = new Player("Student 1");
      
        Player sergio = new Player("Sergio");
        Player jogher = new Player("Jogher");
        Player paco = new Player("Paco");
        Player tomas = new Player("Tomas");
        Player isaac = new Player("Isaac");
        Player franco = new Player("Franco");
        Player isabel = new Player ("Isabel");
        Player messi = new Player("Messi");
        Player diMaria = new Player ("DiMaria");
        Player alvarez = new Player("Alvarez");
      
      
        //ArrayList<Player> playersA = new ArrayList<>();
        //playersA.add(teacher);
        //playersA.add(student1);

        //Team teamA = new Team("Equipo A", playersA);
        Team teamA = new Team("Equipo A");
        teamA.addPlayer(messi);
        teamA.addPlayer(diMaria);
        teamA.addPlayer(isabel);
        teamA.addPlayer(isaac);
        
        Team teamB = new Team("Equipo B");
        teamB.addPlayer(tomas);  
        teamB.addPlayer(jogher);
        teamB.addPlayer(paco);
        teamB.addPlayer(franco);
        
        //showMembers
       teamA.showMembers();
      
        teamB.showMembers();
  
      System.out.println(tomas.showTeam());
    }
}