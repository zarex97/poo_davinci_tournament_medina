package vehiculos;

public abstract class Vehiculo {
    protected String marca;
    protected int kilometraje;
    protected String color;

    public Vehiculo(String marca, int kilometraje, String color) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    public abstract int getNumRuedas();

    public double calcularPrecioRuedas(double precioRueda) {
        return getNumRuedas() * precioRueda;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Color: " + color);
        if (getNumRuedas()>2) {
            System.out.println("Tipo de Vehiculo: Coche");
        }
        else {
            System.out.println("Tipo de Vehiculo: Moto");
        }
        }


    public int getKilometraje() {
        return kilometraje;
    }
}