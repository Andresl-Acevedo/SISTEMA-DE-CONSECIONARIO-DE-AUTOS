package sistema_de_consecionario_de_autos;


public class Proveedor {

    private String nombre;
    private String telefono;

    public Proveedor(String nombre, String telefono) {

        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void mostrarInformacion() {

        System.out.println("----- PROVEEDOR -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }

    public void actualizarContacto(String nuevoTelefono, String nuevoCorreo) {

        this.telefono = nuevoTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    }
