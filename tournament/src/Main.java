import tournament.*;
import sistemaGaraje.*;
import vehiculos.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Team buscarEquipoPorNombre(List<Team> equipos, String nombre) {
        for (Team equipo : equipos) {
            if (equipo.getName().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null;
    }

    private static int calcularPuntosPrediccion(Llave prediccionLlave, Llave llaveReal) {
        int puntos = 0;
        for (Team equipo : prediccionLlave.getTeams()) {
            if (llaveReal.getTeams().contains(equipo)) {
                puntos++;
            }
        }
        return puntos;
    }

    private static Usuario determinarGanador(List<Usuario> usuarios) {
        Usuario ganador = usuarios.get(0);
        for (int i = 1; i < usuarios.size(); i++) {
            if (usuarios.get(i).getPuntos() > ganador.getPuntos()) {
                ganador = usuarios.get(i);
            }
        }
        return ganador;
    }
    public static void main(String[] args) {

        // 8 Grupos
        ArrayList<Grupo> grupos = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            grupos.add(new Grupo("Grupo " + i));
        }

        // equipos por grupo (32 equipos en total)
        String[][] equiposPorGrupo = {
                {"Argentina", "Brasil", "Uruguay", "Colombia"},
                {"Francia", "España", "Alemania", "Portugal"},
                {"Inglaterra", "Italia", "Holanda", "Bélgica"},
                {"Croacia", "Dinamarca", "Suiza", "Suecia"},
                {"México", "Estados Unidos", "Canadá", "Costa Rica"},
                {"Japón", "Corea del Sur", "Arabia Saudita", "Irán"},
                {"Senegal", "Marruecos", "Túnez", "Camerún"},
                {"Qatar", "Ecuador", "Ghana", "Serbia"}
        };

        // crear los equipos y agregarlos a sus respectivos grupos
        for (int i = 0; i < grupos.size(); i++) {
            Grupo grupo = grupos.get(i);
            String[] paises = equiposPorGrupo[i];

            for (String pais : paises) {
                String[] jugadores = new String[4];
                for (int j = 1; j <= 4; j++) {
                    jugadores[j - 1] = pais + j;
                }
                Team equipo = new Team(pais, jugadores);
                grupo.agregarEquipo(equipo);
            }
        }

        // mostrar los grupos y sus equipos
        for (Grupo grupo : grupos) {
            System.out.println(grupo.getName() + ":");
            for (Team equipo : grupo.getTeams()) {
                System.out.println("  - " + equipo.getName() + ":");
                equipo.showMembers();
            }
            System.out.println();
        }

        Random random = new Random();
        for (Grupo grupo : grupos) {
            grupo.generarPartidos();

            for (Match partido : grupo.getMatches()) {
                // se genera goles al azar para determinar unr esultado
                int golesLocal = random.nextInt(5); // se genera golens al azar
                int golesVisitante = random.nextInt(5);

                MatchResult resultado = new MatchResult();
                resultado.setLocalGoalCounter(golesLocal);
                resultado.setVisitantGoalCounter(golesVisitante);
                partido.setMatchResult(resultado);

                System.out.println(partido.getLocalTeam().getName() + " " + golesLocal + " - " + golesVisitante + " " + partido.getVisitantTeam().getName());
            }

            grupo.calcularPuntos(); //  puntos despues de simular los partidos
            System.out.println("--------------------");
        }

        // obtener los equipos que avanzan a la siguiente fase
        List<Team> equiposClasificadosOctavos = new ArrayList<>();
        for (Grupo grupo : grupos) {
            List<Team> clasificadosDelGrupo = grupo.getEquiposQueAvanzan();
            equiposClasificadosOctavos.add(clasificadosDelGrupo.get(0));
            equiposClasificadosOctavos.add(clasificadosDelGrupo.get(1));

            System.out.println("Equipos clasificados de " + grupo.getName() + ":");
            for (Team equipo : clasificadosDelGrupo) {
                System.out.println("- " + equipo.getName() + " (" + equipo.getPuntos() + " puntos)");
            }
            System.out.println("--------------------");
        }

        // --- Fases eliminatorias ---
        // Crear usuarios y vehículos con predicciones
        Usuario usuario1 = new Usuario("Usuario 1");
        Coche coche1 = new Coche("Toyota", 10000, "Rojo", 4);
        usuario1.agregarPrediccion("Octavos de Final", Arrays.asList(
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Argentina"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Brasil"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Francia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "España"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Inglaterra"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Italia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Croacia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Dinamarca")
        ));

        Usuario usuario2 = new Usuario("Usuario 2");
        Moto moto1 = new Moto("Honda", 5000, "Azul", 600);
        usuario2.agregarPrediccion("Octavos de Final", Arrays.asList(
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Argentina"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Uruguay"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Francia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Alemania"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Inglaterra"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Holanda"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Suiza"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "México")
        ));

        Usuario usuario3 = new Usuario("Usuario 3");
        Coche coche2 = new Coche("Ford", 15000, "Blanco", 2);
        usuario3.agregarPrediccion("Octavos de Final", Arrays.asList(
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Brasil"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "España"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Alemania"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Portugal"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Italia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Bélgica"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Suecia"),
                buscarEquipoPorNombre(equiposClasificadosOctavos, "Arabia Saudita")
        ));

        Garaje garaje = new Garaje(25, 40);
        garaje.recibirVehiculo(coche1);
        garaje.recibirVehiculo(moto1);
        garaje.recibirVehiculo(coche2);

        // Octavos de final (16 equipos)
        Llave octavosDeFinal = new Llave("Octavos de Final", equiposClasificadosOctavos);
        List<Team> clasificadosCuartos = octavosDeFinal.generarPartidos();
        octavosDeFinal.mostrarResultadosDeLlave();


// Cuartos de final (8 equipos)
        Llave cuartosDeFinal = new Llave("Cuartos de Final", clasificadosCuartos);

        //calcular los puntos de la predicciones los suarios de los octavos
        usuario1.setPuntos(calcularPuntosPrediccion(usuario1.getPredicciones().get(0), cuartosDeFinal));
        usuario2.setPuntos(calcularPuntosPrediccion(usuario2.getPredicciones().get(0), cuartosDeFinal));
        usuario3.setPuntos(calcularPuntosPrediccion(usuario3.getPredicciones().get(0), cuartosDeFinal));


        //predicciones para la semifinal:

        usuario1.agregarPrediccion("Cuartos de Final", Arrays.asList(
                buscarEquipoPorNombre(clasificadosCuartos, "Argentina"),
                buscarEquipoPorNombre(clasificadosCuartos, "Brasil"),
                buscarEquipoPorNombre(clasificadosCuartos, "Francia"),
                buscarEquipoPorNombre(clasificadosCuartos, "Inglaterra")
        ));

        usuario2.agregarPrediccion("Cuartos de Final", Arrays.asList(
                buscarEquipoPorNombre(clasificadosCuartos, "Argentina"),
                buscarEquipoPorNombre(clasificadosCuartos, "Alemania"),
                buscarEquipoPorNombre(clasificadosCuartos, "Holanda"),
                buscarEquipoPorNombre(clasificadosCuartos, "México")
        ));

        usuario3.agregarPrediccion("Cuartos de Final", Arrays.asList(
                buscarEquipoPorNombre(clasificadosCuartos, "Brasil"),
                buscarEquipoPorNombre(clasificadosCuartos, "España"),
                buscarEquipoPorNombre(clasificadosCuartos, "Italia"),
                buscarEquipoPorNombre(clasificadosCuartos, "Arabia Saudita")
        ));

        List<Team> clasificadosSemiFinal = cuartosDeFinal.generarPartidos();
        cuartosDeFinal.mostrarResultadosDeLlave();

// Semifinal (4 equipos)
        Llave semifinal = new Llave("Semifinal", clasificadosSemiFinal);

        //calcular los puntos de la predicciones los suarios de los cuartos
        usuario1.setPuntos(calcularPuntosPrediccion(usuario1.getPredicciones().get(1), semifinal));
        usuario2.setPuntos(calcularPuntosPrediccion(usuario2.getPredicciones().get(1), semifinal));
        usuario3.setPuntos(calcularPuntosPrediccion(usuario3.getPredicciones().get(1), semifinal));

        // Predicciones para semifinal (2 equipos)
        usuario1.agregarPrediccion("Semifinal", Arrays.asList(
                buscarEquipoPorNombre(clasificadosSemiFinal, "Brasil"),
                buscarEquipoPorNombre(clasificadosSemiFinal, "Francia")
        ));

        usuario2.agregarPrediccion("Semifinal", Arrays.asList(
                buscarEquipoPorNombre(clasificadosSemiFinal, "Argentina"),
                buscarEquipoPorNombre(clasificadosSemiFinal, "Holanda")
        ));

        usuario3.agregarPrediccion("Semifinal", Arrays.asList(
                buscarEquipoPorNombre(clasificadosSemiFinal, "España"),
                buscarEquipoPorNombre(clasificadosSemiFinal, "Italia")
        ));

        List<Team> finalistas = semifinal.generarPartidos();
        semifinal.mostrarResultadosDeLlave();

// Final (2 equipos)
        Llave finalDelTorneo = new Llave("Final", finalistas);

        //calcular los puntos de la predicciones los suarios de la semifinal
        usuario1.setPuntos(calcularPuntosPrediccion(usuario1.getPredicciones().get(2), finalDelTorneo));
        usuario2.setPuntos(calcularPuntosPrediccion(usuario2.getPredicciones().get(2), finalDelTorneo));
        usuario3.setPuntos(calcularPuntosPrediccion(usuario3.getPredicciones().get(2), finalDelTorneo));

        usuario1.agregarPrediccion("Final", Arrays.asList(
                buscarEquipoPorNombre(finalistas, "Brasil")
        ));

        usuario2.agregarPrediccion("Final", Arrays.asList(
                buscarEquipoPorNombre(finalistas, "Argentina")
        ));

        usuario3.agregarPrediccion("Final", Arrays.asList(
                buscarEquipoPorNombre(finalistas, "España")
        ));

        List<Team> campeon = finalDelTorneo.generarPartidos();
        finalDelTorneo.mostrarResultadosDeLlave();
       // mostrar los puntos totales de los usuarios y determinar el ganador
        System.out.println("\nPuntuación final:");
        for (Usuario usuario : Arrays.asList(usuario1, usuario2, usuario3)) {
            System.out.println("- " + usuario.getNombre() + ": " + usuario.getPuntos() + " puntos");
        }

        Usuario ganador = determinarGanador(Arrays.asList(usuario1, usuario2, usuario3));
        System.out.println("\n¡El ganador del juego de predicciones es " + ganador.getNombre() +
                " con " + ganador.getPuntos() + " puntos!");

        System.out.println("¡El campeón del mundo es " + campeon.get(0).getName() + "!");
    }
}