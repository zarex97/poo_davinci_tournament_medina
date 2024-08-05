
    package sistemaGaraje;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

    public class Garaje {
        private double precioRueda;
        private int capacidadMaxima;
        private int numVehiculos;
        private Vehiculo[] vehiculos;

        public Garaje(double precioRueda, int capacidadMaxima) {
            this.precioRueda = precioRueda;
            this.capacidadMaxima = capacidadMaxima;
            this.numVehiculos = 0;
            this.vehiculos = new Vehiculo[capacidadMaxima];
        }

        public boolean recibirVehiculo(Vehiculo vehiculo) {
            if (numVehiculos < capacidadMaxima) {
                vehiculos[numVehiculos] = vehiculo;
                numVehiculos++;
                return true;
            } else {
                System.out.println("El garaje está lleno, no se puede registrar el vehículo.");
                return false;
            }
        }

        public void retirarVehiculo(int posicion) {
            if (posicion >= 0 && posicion < numVehiculos) {
                for (int i = posicion; i < numVehiculos - 1; i++) {
                    vehiculos[i] = vehiculos[i + 1];
                }
                numVehiculos--;
                System.out.println("Vehículo retirado correctamente.");
            } else {
                System.out.println("Posición inválida.");
            }
        }

        public double calcularPrecioRuedasTotal() {
            double precioTotal = 0;
            for (int i = 0; i < numVehiculos; i++) {
                precioTotal += vehiculos[i].calcularPrecioRuedas(precioRueda);
            }
            return precioTotal;
        }

        public double calcularKilometrajeMedio() {
            double kilometrajeTotal = 0;
            for (int i = 0; i < numVehiculos; i++) {
                kilometrajeTotal += vehiculos[i].getKilometraje();
            }
            return (numVehiculos > 0) ? kilometrajeTotal / numVehiculos : 0;
        }

        public void mostrarInformacionGaraje() {
            System.out.println("Información del garaje:");
            System.out.println("Precio por rueda: " + precioRueda);
            System.out.println("Capacidad máxima: " + capacidadMaxima);
            System.out.println("Número de vehículos: " + numVehiculos);
            System.out.println("Precio total de ruedas: " + calcularPrecioRuedasTotal());
            System.out.println("Kilometraje medio: " + calcularKilometrajeMedio());
            System.out.println("--------------------");
        }

        public void mostrarInformacionVehiculos() {
            for (int i = 0; i < numVehiculos; i++) {
                System.out.println("Vehículo " + (i + 1) + ":");
                vehiculos[i].mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }
