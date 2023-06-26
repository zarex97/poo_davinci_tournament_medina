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

        String [] playersG = {"Juancito","Roman","Cordoba","Clemente","Diaz"};
        Team teamG = new Team("Equipo G", playersG);

        String [] playersH = {"Aymar","Palermo","Cruz","Nacho","Ruben"};
        Team teamH = new Team("Equipo H", playersH);

        //TODO: Migrar en Main las implementaciones de la creación de teams, usando el constructor (String, String[])

       teamA.showMembers();
      
       teamB.showMembers();
  
        //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);
        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);
        System.out.println(primerPartido.getMatchStatus());

        Match segundoPartido=new Match(teamC,teamD);
        segundoPartido.makeLocalGoal(0);
        System.out.println(segundoPartido.getMatchStatus());

        Match tercerPartido=new Match(teamE,teamF);
        tercerPartido.makeVisitantGoal(1);
        tercerPartido.makeVisitantGoal(2);
        tercerPartido.makeLocalGoal(0);
        tercerPartido.makeLocalGoal(3);
        tercerPartido.makeLocalGoal(2);
        System.out.println(tercerPartido.getMatchStatus());

        Match cuartoPartido = new Match(teamG,teamH);
        cuartoPartido.makeLocalGoal(2);
        cuartoPartido.makeVisitantGoal(0);
        cuartoPartido.makeVisitantGoal(1);
        cuartoPartido.makeLocalGoal(3);
        System.out.println(cuartoPartidoPartido.getMatchStatus());

    }


}