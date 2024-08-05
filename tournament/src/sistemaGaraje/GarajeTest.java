package sistemaGaraje;

import vehiculos.Coche;
import vehiculos.Moto;

public class GarajeTest {
    public static void main(String[] args) {
        // crear un garaje con un precio por rueda de 25 y una capacidad máxima de 5 vehículos
        Garaje garaje = new Garaje(25, 5);

        // crear algunos vehículos
        Coche coche1 = new Coche("Toyota", 10000, "Rojo", 4);
        Moto moto1 = new Moto("Honda", 5000, "Azul", 600);
        Coche coche2 = new Coche("Ford", 15000, "Blanco", 2);

        // intentar recibir los vehículos en el garaje
        garaje.recibirVehiculo(coche1);
        garaje.recibirVehiculo(moto1);
        garaje.recibirVehiculo(coche2);

        // mostrar la información del garaje y de los vehículos
        garaje.mostrarInformacionGaraje();
        garaje.mostrarInformacionVehiculos();
    }
}