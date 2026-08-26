Clase ftransaccion
public class Transaccion {

    private String idTransaccion;
    private String tipo;
    private double monto;
    private String fecha;
    private String descripcion;

    public Transaccion(String idTransaccion, String tipo, double monto,
                       String fecha, String descripcion) {
        this.idTransaccion = idTransaccion;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrarTransaccion() {
        System.out.println("----- TRANSACCION -----");
        System.out.println("ID: " + idTransaccion);
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("Descripcion: " + descripcion);
    }

    public boolean esIngreso() {
        return tipo.equalsIgnoreCase("INGRESO");
    }

    public boolean esEgreso() {
        return tipo.equalsIgnoreCase("EGRESO");
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
