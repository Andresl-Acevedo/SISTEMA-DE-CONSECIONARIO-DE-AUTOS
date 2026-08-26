public class Cliente {

    private String idCliente;
    private String nombre;
    private String documento;
    private String telefono;
    private String correo;

    public Cliente(String idCliente, String nombre, String documento, String telefono, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void mostrarInformacion() {
        System.out.println("----- CLIENTE -----");
        System.out.println("ID: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
    }

    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    public void registrarCompra() {
        System.out.println("Compra registrada para el cliente: " + nombre);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
