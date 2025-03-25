package DGTMODEL;

public class Vehiculo {

        protected String matricula;
        protected String marca;
        protected int km;
        protected int añoFabricacion;
        protected PROPIETARIO.Propietario propietario;

        public Vehiculo(String matricula, String marca, int km, int anoFabricacion, PROPIETARIO.Propietario propietario) {
            this.matricula = matricula;
            this.marca = marca;
            this.km = km;
            this.añoFabricacion = anoFabricacion;
            this.propietario = propietario;
        }

        public int getEdadVehiculo(int añoActual) {
            return añoActual - añoFabricacion;
        }

        public String getMatricula() { return matricula; }

        @Override
        public String toString() {
            return "Matricula: " + matricula + ", Marca: " + marca + ", KM: " + km + ", Año: " + añoFabricacion;
        }
}
