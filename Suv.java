package sistema_de_consecionario_de_autos;

public class SUV extends Vehiculo {

    private boolean traccion4x4;

    public SUV(String placa, String marca, String modelo,
               double precio, String color, String estado, boolean traccion4x4) {

        super(placa, marca, modelo, precio, color, estado);

        this.traccion4x4 = traccion4x4;
    }

    @Override
    public String getTipoVehiculo() {
        return "SUV";
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println(
                "SUV: " +
                (traccion4x4 ? "Si" : "No")
        );
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }
}
