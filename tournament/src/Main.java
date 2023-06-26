import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Team teamA = new Team("Equipo A",{"Messi", "DiMaria", "Isabel", "Isaac"});

        Team teamB = new Team("Equipos B",{"Tomas", "Jogher", "Paco", "Franco"} );

        Team teamC = new Team("Equipo C",{"Almada", "Dybala", "DePaul", "MacAllister"});

        Team teamD = new Team("Equipo D", {"Pepe", "Lucio", "Mario", "Luigi"});

        Team teamE = new Team("Equipo E",{"Ana", "Carlos", "Sofia", "Javier", "Javier","Mariana"});

        Team teamF = new Team("Equipo F",{"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"});


        String [] playersG = {"Juancito","Roman","Cordoba","Clemente","Diaz"};
        Team teamG = new Team("Equipo G", playersG);

        String [] playersH = {"Aymar","Palermo","Cruz","Nacho","Ruben"};
        Team teamH = new Team("Equipo H", playersH);

       teamA.showMembers();
      
       teamB.showMembers();
  
        //System.out.println(tomas.showTeam());

        Match primerPartido = new Match(teamA, teamB);
        Match segundoPartido=new Match(teamC,teamD);
        Match tercerPartido=new Match(teamE,teamF);
        Match cuartoPartido = new Match(teamG,teamH);

        primerPartido.makeLocalGoal(1);
        primerPartido.makeVisitantGoal(2);
        primerPartido.makeVisitantGoal(3);
        System.out.println(primerPartido.getMatchStatus());

        segundoPartido.makeLocalGoal(0);
        System.out.println(segundoPartido.getMatchStatus());

        tercerPartido.makeVisitantGoal(1);
        tercerPartido.makeVisitantGoal(2);
        tercerPartido.makeLocalGoal(0);
        tercerPartido.makeLocalGoal(3);
        tercerPartido.makeLocalGoal(2);
        System.out.println(tercerPartido.getMatchStatus());

        cuartoPartido.makeLocalGoal(2);
        cuartoPartido.makeVisitantGoal(0);
        cuartoPartido.makeVisitantGoal(1);
        cuartoPartido.makeLocalGoal(3);
        System.out.println(cuartoPartido.getMatchStatus());

    }


}