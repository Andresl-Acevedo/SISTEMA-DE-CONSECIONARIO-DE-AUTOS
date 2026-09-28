package sistema_de_consecionario_de_autos;

/**
 *
 * @author PC GAMER
 */
public class Sedan extends Vehiculo {

    private int numeroPuertas;

    public Sedan(String placa, String marca, String modelo,
                 double precio, String color, String estado, int numeroPuertas) {

        super(placa, marca, modelo, precio, color, estado);

        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException(
                "El carro sedan debe tener al menos una puerta."
            );
        }

        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public  String getTipoVehiculo() {
        return "Sedan";
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Numero de puertas: " + numeroPuertas);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}

