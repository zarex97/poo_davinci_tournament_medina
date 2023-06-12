import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player teacher = new Player("Teacher");
        Player student1 = new Player("Student 1");
      
        Player sergio = new Player("Sergio");
        Player isaac = new Player("Isaac");
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
        teamB.addPlayer(new Player("Tomas"));
        teamB.addPlayer(new Player("Jogher"));
        teamB.addPlayer(new Player("Paco"));
        teamB.addPlayer(new Player("Franco"));
        
        //showMembers
       teamA.showMembers();
      
        teamB.showMembers();
  
      System.out.println(tomas.showTeam());

        Match primerPartido = new Match();
        primerPartido.setLocalTeam(teamA);
        primerPartido.setVisitantTeam(teamB);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);

        primerPartido.getMatchStatus();

    }


}