package vehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, int kilometraje, String color, int numPuertas) {
        super(marca, kilometraje, color);
        this.numPuertas = numPuertas;
    }

    @Override
    public int getNumRuedas() {
        return 4;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
    }
}