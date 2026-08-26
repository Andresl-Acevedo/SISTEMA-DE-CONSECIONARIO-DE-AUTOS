public class Mantenimiento {

    private String idMantenimiento;
    private String placaVehiculo;
    private String fecha;
    private String tipo;
    private String descripcion;
    private double costo;

    public Mantenimiento(String idMantenimiento, String placaVehiculo,
                          String fecha, String tipo, String descripcion,
                          double costo) {
        this.idMantenimiento = idMantenimiento;
        this.placaVehiculo = placaVehiculo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public double calcularCostoTotal() {
        return costo;
    }

    public void mostrarMantenimiento() {
        System.out.println("----- MANTENIMIENTO -----");
        System.out.println("ID: " + idMantenimiento);
        System.out.println("Vehiculo: " + placaVehiculo);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Costo: $" + costo);
    }

    public void actualizarCosto(double nuevoCosto) {
        this.costo = nuevoCosto;
    }

    public String getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(String idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
