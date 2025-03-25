package DGTMODEL;

public class COCHE {

    public static class Coche extends Vehiculo {
        private int numAsientos;
        private boolean tieneAirbags;

        public Coche(String matricula, String marca, int km, int anoFabricacion, PROPIETARIO.Propietario propietario, int numAsientos, boolean tieneAirbags) {
            super(matricula, marca, km, anoFabricacion, propietario);
            this.numAsientos = numAsientos;
            this.tieneAirbags = tieneAirbags;
        }

        public boolean tieneSillitaBebe() {
            return numAsientos > 4;
        }
    }
}
