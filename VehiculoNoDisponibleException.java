package sistema_de_consecionario_de_autos;

public class VehiculoNoDisponibleException extends RuntimeException {

    public VehiculoNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
