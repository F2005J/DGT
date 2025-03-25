package DGTMODEL;

import java.util.ArrayList;
import java.util.List;
public class OFICINA {

    public class Oficina {
        private String ciudad;
        private String cp;
        private String direccion;
        private boolean gestionaCobros;
        private String empresaLimpieza;
        private List<Vehiculo> vehiculos = new ArrayList<>();
        private List<PROPIETARIO.Propietario> propietarios = new ArrayList<>();

        public Oficina(String ciudad, String cp, String direccion, boolean gestionaCobros, String empresaLimpieza) {
            this.ciudad = ciudad;
            this.cp = cp;
            this.direccion = direccion;
            this.gestionaCobros = gestionaCobros;
            this.empresaLimpieza = empresaLimpieza;
        }

        public void agregarPropietario(PROPIETARIO.Propietario p) {
            propietarios.add(p);
        }

        public void agregarVehiculo(Vehiculo v) {
            vehiculos.add(v);
        }

        public PROPIETARIO.Propietario buscarPropietarioPorDni(String dni) {
            return propietarios.stream().filter(p -> p.getDni().equals(dni)).findFirst().orElse(null);
        }

        public List<PROPIETARIO.Propietario> buscarPropietarioPorApellidos(String apellidos) {
            List<PROPIETARIO.Propietario> resultado = new ArrayList<>();
            for (PROPIETARIO.Propietario p : propietarios) {
                if (p.getApellidos().equalsIgnoreCase(apellidos)) {
                    resultado.add(p);
                }
            }
            return resultado;
        }

        public Vehiculo buscarVehiculoPorMatricula(String matricula) {
            return vehiculos.stream().filter(v -> v.getMatricula().equals(matricula)).findFirst().orElse(null);
        }
    }
}
