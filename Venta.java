package sistema_de_consecionario_de_autos;


public class Venta {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fecha;
    private double precioVenta;
    private String metodoPago;

    public Venta(Cliente cliente, Vehiculo vehiculo,
                 String fecha, double precioVenta, String metodoPago) {

        if (!vehiculo.getEstado().equalsIgnoreCase("Disponible")) {
            throw new VehiculoNoDisponibleException(
                "El vehiculo no esta disponible para la venta."
            );
        }

        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
        this.metodoPago = metodoPago;

        // Al venderlo, cambia su estado
        vehiculo.cambiarEstado("Vendido");
    }

    public double calcularTotal() {
        return precioVenta;
    }

    public void mostrarVenta() {

        System.out.println("----- VENTA -----");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehiculo: " + vehiculo.getPlaca());
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: $" + precioVenta);
        System.out.println("Metodo de pago: " + metodoPago);
    }

    public void aplicarDescuento(double porcentaje) {

        if (porcentaje < 0 || porcentaje > 100) {
            throw new PrecioInvalidoException(
                "El descuento debe estar entre 0 y 100."
            );
        }

        this.precioVenta =
            this.precioVenta -
            (this.precioVenta * porcentaje / 100);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
