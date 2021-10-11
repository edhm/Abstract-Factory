
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JackStv
 */
public class Catalogo {

    public static int nautos = 3;
    public static int nScooter = 3;
    public static int nMotocicletas = 3;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Vehiculo vehiculoFab;
        Automovil[] autos = new Automovil[nautos];
        Scooter[] scooters = new Scooter[nautos];
        Motocicleta[] motocicletas = new Motocicleta[nautos];
        System.out.println("Seleccione un Vehículo\n"
                + "Vehículo Electrico   < 1 >\n"
                + "Vehículo Gasolinero  < 2 >\n"
        );
        String eleccion = reader.next();
        if (eleccion.equals("1")) {
            vehiculoFab = new VehiculoElectrico();
        } else {
            vehiculoFab = new VehiculoGasolinero();
        }
        for (int i = 0; i < nautos; i++) {
            autos[i] = vehiculoFab.creaAutomovil("Empresarial", "Rojo", 6 + i, 3.2);
        }
        for (int i = 0; i < nScooter; i++) {
            scooters[i] = vehiculoFab.crearScooter("Clásico", "Red", 2 + i);
        }
        for (int i = 0; i < nMotocicletas; i++) {
            motocicletas[i] = vehiculoFab.creaMotocicleta("Harley", "Red and Gold", "Pistera", 3);
        }
        for (Automovil auto : autos) {
            auto.mostrarCaracteristicas();
        }
        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }
        for (Motocicleta motocicleta : motocicletas) {
            motocicleta.mostrarCaracteristicas();
        }

    }

}
