package sistema_de_consecionario_de_autos;
import javax.swing.JOptionPane;
public class Sistema_de_Consecionario_de_Autos {
    public static void main(String[] args) {

        String placa = JOptionPane.showInputDialog("Ingrese la placa:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");

        int año = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año:")
        );

        double precio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el precio:")
        );

        String color = JOptionPane.showInputDialog("Ingrese el color:");
        String estado = JOptionPane.showInputDialog("Ingrese el estado:");

        Vehiculo vehiculo = new Vehiculo(
                placa,
                marca,
                modelo,
                año,
                precio,
                color,
                estado
        );

        // CLIENTE
        
        String idCliente = JOptionPane.showInputDialog(
                "Ingrese el ID del cliente:"
        );

        String nombre = JOptionPane.showInputDialog(
                "Ingrese el nombre del cliente:"
        );

        String cedula = JOptionPane.showInputDialog(
                "Ingrese la cedula:"
        );

        String telefono = JOptionPane.showInputDialog(
                "Ingrese el telefono:"
        );

        String correo = JOptionPane.showInputDialog(
                "Ingrese el correo:"
        );

        Cliente cliente = new Cliente(
                idCliente,
                nombre,
                cedula,
                telefono,
                correo
        );


        // PROVEEDOR
        
        String idProveedor = JOptionPane.showInputDialog(
                "Ingrese el ID del proveedor:"
        );

        String nombreProveedor = JOptionPane.showInputDialog(
                "Ingrese el nombre del proveedor:"
        );

        String empresa = JOptionPane.showInputDialog(
                "Ingrese la empresa:"
        );

        String telefonoProveedor = JOptionPane.showInputDialog(
                "Ingrese el telefono:"
        );

        String correoProveedor = JOptionPane.showInputDialog(
                "Ingrese el correo:"
        );

        String ciudad = JOptionPane.showInputDialog(
                "Ingrese la ciudad:"
        );

        Proveedor proveedor = new Proveedor(
                idProveedor,
                nombreProveedor,
                empresa,
                telefonoProveedor,
                correoProveedor,
                ciudad
        );


        //INFO
        
        vehiculo.mostrarInformacion();

        cliente.mostrarInformacion();

        proveedor.mostrarInformacion();


        //PRUEBAS

        double descuento = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese el porcentaje de descuento:"
                )
        );

        vehiculo.aplicarDescuento(descuento);

        JOptionPane.showMessageDialog(
                null,
                "Precio con descuento: $" + vehiculo.getPrecio()
        );


        String nuevoEstado = JOptionPane.showInputDialog(
                "Ingrese el nuevo estado del vehiculo:"
        );

        vehiculo.cambiarEstado(nuevoEstado);

        JOptionPane.showMessageDialog(
                null,
                "Nuevo estado: " + vehiculo.getEstado()
        );


        String nuevoTelefono = JOptionPane.showInputDialog(
                "Ingrese el nuevo telefono del cliente:"
        );

        cliente.actualizarTelefono(nuevoTelefono);

        JOptionPane.showMessageDialog(
                null,
                "Nuevo telefono: " + cliente.getTelefono()
        );
    }
}
