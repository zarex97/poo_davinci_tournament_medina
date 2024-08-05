package sistemaGaraje;

import tournament.*;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int puntos;
    private List<Llave> predicciones; // Lista de predicciones, cada una es una Llave

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.predicciones = new ArrayList<>();
    }

    public void agregarPrediccion(String nombreLlave, List<Team> equipos) {
        Llave prediccion = new Llave(nombreLlave, equipos);
        this.predicciones.add(prediccion);
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<Llave> getPredicciones() {
        return predicciones;
    }

}