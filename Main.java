package sistema_de_consecionario_de_autos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Sistema_de_Consecionario_de_Autos {

    public static void main(String[] args) {

        try {

            // LISTA DE INFORMACION

            ArrayList<Vehiculo> vehiculos = new ArrayList<>();
            ArrayList<Cliente> clientes = new ArrayList<>();
            ArrayList<Proveedor> proveedores = new ArrayList<>();
            ArrayList<Venta> ventas = new ArrayList<>();
            ArrayList<Compra> compras = new ArrayList<>();

            // CREAR CARRO

            String placa = JOptionPane.showInputDialog("Ingrese la placa:");
            String marca = JOptionPane.showInputDialog("Ingrese la marca:");
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");       
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));      
            String color = JOptionPane.showInputDialog("Ingrese el color:");
            String estado = JOptionPane.showInputDialog("Ingrese el estado (Disponible/Vendido):");
            int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas:"));

            // POLIMORFISMO

            Vehiculo vehiculo = new Sedan(
                    placa,
                    marca,
                    modelo,
                    precio,
                    color,
                    estado,
                    numeroPuertas
            );
            
            Vehiculo vehiculo2 = new SUV(
                    "XYZ789",
                    "Toyota",
                    "2025",
                    120000000,
                    "Negro",
                    "Disponible",
                    true
            );

            // Guardamos LAS VARIABLES
            vehiculos.add(vehiculo);
            vehiculos.add(vehiculo2);

            // CLIENTE

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedula = JOptionPane.showInputDialog("Ingrese la cedula:");
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
            String correo = JOptionPane.showInputDialog("Ingrese el correo:");

            Cliente cliente = new Cliente(
                    nombre,
                    cedula,
                    telefono,
                    correo
            );

            clientes.add(cliente);

            // PROVEEDOR

            String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor:");
            String telefonoProveedor = JOptionPane.showInputDialog("Ingrese el telefono del proveedor:");

            Proveedor proveedor = new Proveedor(
                    nombreProveedor,
                    telefonoProveedor
            );

            proveedores.add(proveedor);

            // MOSTRAR INFORMACION

            System.out.println();
            System.out.println("=================================");
            System.out.println("      INFORMACION REGISTRADA");
            System.out.println("=================================");

            vehiculo.mostrarInformacion();
            System.out.println();
            cliente.mostrarInformacion();
            System.out.println();
            proveedor.mostrarInformacion();

            // DESCUENTO

            double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de descuento:"));

            vehiculo.aplicarDescuento(descuento);

            JOptionPane.showMessageDialog(null, "Precio con descuento: $" + vehiculo.getPrecio());
            
            // CAMBIAR ESTADO

            String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado del vehiculo:");

            vehiculo.cambiarEstado(nuevoEstado);

            JOptionPane.showMessageDialog(null, "Nuevo estado: " + vehiculo.getEstado());
            
            // ACTUALIZAR TELEFONO

            String nuevoTelefono = JOptionPane.showInputDialog("Ingrese el nuevo telefono del cliente:");

            cliente.actualizarTelefono(nuevoTelefono);

            JOptionPane.showMessageDialog(null,"Nuevo telefono: " + cliente.getTelefono());
            
            // MOSTRAR INFORMACION DIARIA

            System.out.println();
            System.out.println("=================================");
            System.out.println("       INFORMACION DIARIA");
            System.out.println("=================================");

            System.out.println("Cantidad de vehiculos: " + vehiculos.size());
            System.out.println("Cantidad de clientes: " + clientes.size());
            System.out.println("Cantidad de proveedores: " + proveedores.size());

            // RECORRER LISTA
            
            System.out.println();
            System.out.println("----- VEHICULOS REGISTRADOS -----");

            for (Vehiculo v : vehiculos) {
                System.out.println("Placa: " + v.getPlaca());
                System.out.println("Tipo: " + v.getTipoVehiculo());
                System.out.println("Marca: " + v.getMarca());
                System.out.println();
            }

            // INTENTAR REALIZAR UNA VENTA

            int realizarVenta = JOptionPane.showConfirmDialog(null, "Desea registrar una venta?", "Venta", JOptionPane.YES_NO_OPTION);

            if (realizarVenta == JOptionPane.YES_OPTION) {
                
                String fecha = JOptionPane.showInputDialog("Ingrese la fecha:");

                double precioVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de venta:"));

                String metodoPago = JOptionPane.showInputDialog("Ingrese el metodo de pago:");

                try {

                    Venta venta = new Venta(
                            cliente,
                            vehiculo,
                            fecha,
                            precioVenta,
                            metodoPago
                    );

                    ventas.add(venta);

                    venta.mostrarVenta();

                    JOptionPane.showMessageDialog(null, "Venta registrada correctamente.");

                } catch (VehiculoNoDisponibleException e) {

                    JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
                }
            }

            // RESULTADO FINAL

            System.out.println();
            System.out.println("=================================");
            System.out.println("       RESUMEN DEL SISTEMA");
            System.out.println("=================================");

            System.out.println("Vehiculos: " + vehiculos.size());

            System.out.println( "Clientes: " + clientes.size());

            System.out.println("Proveedores: " + proveedores.size());

            System.out.println("Ventas: " + ventas.size());

            System.out.println("Compras: " + compras.size());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un numero valido.");

        } catch (PrecioInvalidoException e) {

            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.getMessage());
        }
    }
}
