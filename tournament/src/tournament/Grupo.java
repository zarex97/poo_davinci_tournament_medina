package tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends Season {

    public Grupo(String name) {
        setName(name);
        setMatches(new ArrayList<>());
        setTeams(new ArrayList<>());
    }

    public void agregarEquipo(Team equipo) {
        getTeams().add(equipo);
    }

    public void generarPartidos() {
        ArrayList<Team> equipos = getTeams();
        // generar todos los partidos posibles (ida y vuelta) con iteración
        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Match partidoIda = new Match(equipos.get(i), equipos.get(j));
                Match partidoVuelta = new Match(equipos.get(j), equipos.get(i));
                getMatches().add(partidoIda);
                getMatches().add(partidoVuelta);
            }
        }
    }

    public void calcularPuntos() {
        for (Team equipo : getTeams()) {
            equipo.setPuntos(0);
        }

        for (Match partido : getMatches()) {
            Team local = partido.getLocalTeam();
            Team visitante = partido.getVisitantTeam();
            MatchResult resultado = partido.getMatchResult();
            //aquí se asume que ya se jugaron los partidos, de otra forma da un error
            // y que se guardaron los resultados en el atributo 'result' de cada Match
            if (resultado.localWin()) {
                local.setPuntos(local.getPuntos() + 3);
            } else if (resultado.tie()) {
                local.setPuntos(local.getPuntos() + 1);
                visitante.setPuntos(visitante.getPuntos() + 1);
            } else {
                visitante.setPuntos(visitante.getPuntos() + 3);
            }
        }
    }

    public ArrayList<Team> getEquiposQueAvanzan() {
        // ordenar equipos por puntos (de mayor a menor)
        Collections.sort(getTeams(), Comparator.comparingInt(Team::getPuntos).reversed());

        // retornar los dos primeros equipos (asumiendo que no hay empates en puntos)
        ArrayList<Team> clasificados = new ArrayList<>();
        clasificados.add(getTeams().get(0));
        clasificados.add(getTeams().get(1));
        return clasificados;
    }
}