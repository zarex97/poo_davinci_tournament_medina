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
        String[] teamlistA = {"Messi", "DiMaria", "Isabel", "Isaac"};
        Team teamA = new Team("Equipo A");
        for (String name : teamlistA) {
            teamA.addPlayer(new Player(name));
        }

        String[] teamlistB = {"Tomas", "Jogher", "Paco", "Franco"};
        Team teamB = new Team("Equipo B");
        for (String name : teamlistB) {
            teamA.addPlayer(new Player(name));
        }

        String [] teamCList =  {"Almada", "Dybala", "DePaul", "MacAllister"};
        Team teamC = new Team("Equipo C");
        for (String name : teamCList){
            teamC.addPlayer(new Player(name));
        }

        String [] teamDList =  {"Pepe", "Lucio", "Mario", "Luigi"};
        Team teamD = new Team("Equipo D");
        for (String name : teamDList){
            teamD.addPlayer(new Player(name));
        }
        
       teamA.showMembers();
      
       teamB.showMembers();
  
      //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);

        System.out.println(primerPartido.getMatchStatus());

    }


}