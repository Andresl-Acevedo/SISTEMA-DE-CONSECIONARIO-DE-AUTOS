public class Venta {

    private String idVenta;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fecha;
    private double precioVenta;
    private String metodoPago;

    public Venta(String idVenta, Cliente cliente, Vehiculo vehiculo, String fecha, double precioVenta, String metodoPago) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.precioVenta = precioVenta;
        this.metodoPago = metodoPago;
    }

    public double calcularTotal() {
        return precioVenta;
    }

    public void mostrarVenta() {
        System.out.println("----- VENTA -----");
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehiculo: " + vehiculo.getPlaca());
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: $" + precioVenta);
        System.out.println("Metodo de pago: " + metodoPago);
    }

    public void aplicarDescuento(double porcentaje) {
        this.precioVenta = this.precioVenta -
                (this.precioVenta * porcentaje / 100);
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
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
