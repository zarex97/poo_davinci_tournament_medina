import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TODO: Eliminar objetos de Player en Main
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
      
        Team teamE = new Team("Equipo E");
        String [] playersE = {"Ana", "Carlos", "Sofia", "Javier", "Javier","Mariana"};
        for (String player: playersE){
            teamE.addPlayer (new Player(player));
        };
      
        Team teamF = new Team("Equipo F");
        String [] playersF = {"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"};
        for (String player: playersF){
            teamF.addPlayer (new Player(player));
        }

        //TODO: Migrar en Main las implementaciones de la creación de teams, usando el constructor (String, String[])
        
        //TODO: Agregar jugadorres a teamG y teamH, y el partido

       teamA.showMembers();
      
       teamB.showMembers();
  
        //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);

        System.out.println(primerPartido.getMatchStatus());

        //TODO: Agregar partidos entre teamC y teamD, teamE y teamF


        //TODO: Agregar jugadorres a teamG y teamH, y el partido

    }


}