# poo_davinci_tournament

# To Do

## Season class
[ ] Agregar método addMatch(Match) -> void



## Main class
[ ] Crear la llave cuartoFinal :: Llave

[ ] Agregar los partidos a la llave cuartoFinal

[ ] Pedir los equipos que avanzan a semis e imprimir equipos -> equiposSemi :: ArrayList<Team>

[ ] Crear equiposCuarto :: ArrayList<Team>, y agregarle los equipos (con add, en orden)

[ ] Reemplazar equipos en constructor de cada partido, usando get(id)

![class_diagram.png](class_diagram.png)



## Done:

[-] Incrementar el contador de goles locales en Match. (makeLocalGoal: void -> void)

[-] Incrementar el contador de goles visitante en Match (makeVisitantGoal: void -> void)

[-] Determinar quien es el equipo ganador, no puede haber empates. (getWinner: void -> Team)

[-] Mostrar el marcador del partido. (getMatchStatus: void -> String )

[-] Incrementar el contador de goles del jugador del equipo que hizo el gol. (makeLocalGoal: int -> void)

[-] Incrementar el contador de goles del jugador del equipo que hizo el gol. (makeVisitantGoal: int -> void)

[-] Agregar constructores de Match

[-] Crear Match entre "Equipo A" (local) y "Equipo B" (visitante)

[-] Hacer un gol de local y dos de visitante

[-] Mostrar el marcado e indicar quien ganó

[-] Agregar jugadores a teamA usando iteración

[-] Agregar jugadores a teamB usando iteración

[-] Agregar jugares a teamC y teamD

[-] Agregar jugares a teamE y teamF

[-] Crear la clase Llave que hereda de Season. Tiene que definido:

    - ArrayList<Equipo> getEquiposQueAvanzan()

[-] Crear la clase Grupo que hereda de Season. Tiene que definido:

    - ArrayList<Equipo> getEquiposQueAvanzan()

[-] Crear la clase MatchResult

    - private int localGoalCounter;
    - private int visitantGoalCounter;
    - getter y setters

[-] Actualizar la clase Match

    - sacamos localGoalCounter y visitantGoalCounter (sus getters y setter tambien) y dejamos MatchResult result;

[-] Agregar en MatchResult

    - ganoLocal(): boolean
    - empate(): boolean

[-] modificar getWinner()

[-] En la clase Team, agregar el constructor que soporte String[] players y que itere agregando players

[-] Migrar en Main las implementaciones de la creación de teams, usando el constructor (String, String[])

[-] Eliminar objetos de Player en Main

[-] Agregar partidos entre teamC y teamD, teamE y teamF

[-] Agregar jugadorres a teamG y teamH, y el partido