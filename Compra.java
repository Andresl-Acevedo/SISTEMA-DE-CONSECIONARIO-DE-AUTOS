public class Compra {

    private String idCompra;
    private Proveedor proveedor;
    private Vehiculo vehiculo;
    private String fecha;
    private double precioCompra;
    private String metodoPago;

    public Compra(String idCompra, Proveedor proveedor, Vehiculo vehiculo, String fecha, double precioCompra, String metodoPago) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
        this.metodoPago = metodoPago;
    }

    public double calcularCosto() {
        return precioCompra;
    }

    public void mostrarCompra() {
        System.out.println("----- COMPRA -----");
        System.out.println("ID Compra: " + idCompra);
        System.out.println("Proveedor: " + proveedor.getEmpresa());
        System.out.println("Vehiculo: " + vehiculo.getPlaca());
        System.out.println("Fecha: " + fecha);
        System.out.println("Precio: $" + precioCompra);
        System.out.println("Metodo de pago: " + metodoPago);
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
