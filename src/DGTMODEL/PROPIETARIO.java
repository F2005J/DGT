package DGTMODEL;

public class PROPIETARIO {

    public static class Propietario {
        private String dni;
        private String nombre;
        private String apellidos;
        private int puntos;

        public Propietario(String dni, String nombre, String apellidos, int puntos) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.puntos = puntos;
        }

        public String getDni() { return dni; }
        public String getApellidos() { return apellidos; }

        @Override
        public String toString() {
            return "DNI: " + dni + ", Nombre: " + nombre + " " + apellidos + ", Puntos: " + puntos;
        }
    }


}
