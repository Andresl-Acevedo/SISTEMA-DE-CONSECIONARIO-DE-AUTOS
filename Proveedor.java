public class Proveedor {

    private String idProveedor;
    private String nombre;
    private String empresa;
    private String telefono;
    private String correo;
    private String direccion;

    public Proveedor(String idProveedor, String nombre, String empresa, String telefono, String correo, String direccion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public void mostrarInformacion() {
        System.out.println("----- PROVEEDOR -----");
        System.out.println("ID: " + idProveedor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Empresa: " + empresa);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Direccion: " + direccion);
    }

    public void actualizarContacto(String nuevoTelefono, String nuevoCorreo) {
        this.telefono = nuevoTelefono;
        this.correo = nuevoCorreo;
    }

    public void registrarProveedor() {
        System.out.println("Proveedor registrado: " + empresa);
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
