package DGTMODEL;

public class MOTO {

    public class Moto extends Vehiculo {
        private int potencia;
        private String tipo;

        public Moto(String matricula, String marca, int km, int anoFabricacion, PROPIETARIO.Propietario propietario, int potencia, String tipo) {
            super(matricula, marca, km, anoFabricacion, propietario);
            this.potencia = potencia;
            this.tipo = tipo;
        }
    }
}
