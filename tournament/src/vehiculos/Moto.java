package vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int kilometraje, String color, int cilindrada) {
        super(marca, kilometraje, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public int getNumRuedas() {
        return 2;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada);
    }
}