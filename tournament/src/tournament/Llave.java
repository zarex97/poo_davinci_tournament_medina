package tournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Llave extends Season {

        public Llave(String name, List<Team> equiposClasificados) {
                setName(name);
                setMatches(new ArrayList<>());
                setTeams(new ArrayList<>(equiposClasificados));
        }

        public List<Team> generarPartidos() {
                getMatches().clear(); // si no se limpian los equipos previos se buggea
                List<Team> equipos = new ArrayList<>(getTeams());
                Random random = new Random();
                ArrayList<Team> ganadores = new ArrayList<>();

                for (int i = 0; i < equipos.size(); i += 2) {
                        Team local = equipos.get(i);
                        Team visitante = equipos.get(i + 1);

                        Match partido = new Match(local, visitante);

                        MatchResult resultado = new MatchResult();
                        int golesLocal = random.nextInt(5);
                        int golesVisitante = random.nextInt(5);
                        resultado.setLocalGoalCounter(golesLocal);
                        resultado.setVisitantGoalCounter(golesVisitante);
                        partido.setMatchResult(resultado);

                        getMatches().add(partido);

                        if (golesLocal > golesVisitante) {
                                ganadores.add(local);
                        } else if (golesVisitante > golesLocal) {
                                ganadores.add(visitante);
                        } else {
                                // En caso de empate, decide al azar
                                ganadores.add(random.nextBoolean() ? local : visitante);
                        }
                }

                setTeams(ganadores);
                return ganadores;
        }

        public void mostrarResultadosDeLlave() {
                System.out.println("----- " + getName() + " -----");
                for (Match partido : getMatches()) {
                        int golesLocal = partido.getMatchResult().getLocalGoalCounter();
                        int golesVisitante = partido.getMatchResult().getVisitantGoalCounter();
                        System.out.println(partido.getLocalTeam().getName() + " " + golesLocal + " - " + golesVisitante + " " + partido.getVisitantTeam().getName());
                }
                System.out.println("Equipos clasificados:");
                for (Team equipo : getTeams()) {
                        System.out.println("- " + equipo.getName());
                }
                System.out.println();
        }
}