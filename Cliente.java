package sistema_de_consecionario_de_autos;


public class Cliente {

    private String nombre;
    private String documento;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String documento,
                   String telefono, String correo) {

        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void mostrarInformacion() {

        System.out.println("----- CLIENTE -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
    }

    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    public void registrarCompra() {
        System.out.println(
            "Compra registrada para el cliente: " + nombre
        );
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
