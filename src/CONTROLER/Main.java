package CONTROLER;

import DGTMODEL.PROPIETARIO;
import DGTMODEL.*;

public class Main {
    public static void main(String[] args) {
        OFICINA.Oficina oficina = new OFICINA.Oficina("Valencia", "46001", "Calle Mayor, 12", true, "Limpiezas S.A.");

        PROPIETARIO.Propietario p1 = new PROPIETARIO.Propietario("12345678A", "Juan", "Perez", 12);
        oficina.agregarPropietario(p1);

        COCHE.Coche coche1 = new COCHE.Coche("1234ABC", "Toyota", 50000, 2018, p1, 5, true);
        oficina.agregarVehiculo(coche1);

        System.out.println(oficina.buscarPropietarioPorDni("12345678A"));
        System.out.println(oficina.buscarVehiculoPorMatricula("1234ABC"));
    }
}
