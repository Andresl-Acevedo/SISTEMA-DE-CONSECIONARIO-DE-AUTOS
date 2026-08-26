public class Main {

    public static void main(String[] args) {

        // Crear vehiculo
        Vehiculo vehiculo = new Vehiculo(
                "ACV123",
                "Toyota",
                "Corolla",
                2025,
                95000000,
                "Blanco",
                "Disponible"
        );

        // Crear cliente
        Cliente cliente = new Cliente(
                "001",
                "Carlos Perez",
                "123456789",
                "3001234567",
                "carlos@gmail.com"
        );

        // Crear proveedor
        Proveedor proveedor = new Proveedor(
                "P001",
                "Andres Gomez",
                "Toyota Colombia",
                "3100000000",
                "ventas@empresa.com",
                "Bogota"
        );

        // Crear mantenimiento
        Mantenimiento mantenimiento = new Mantenimiento(
                "M001",
                "ACV123",
                "24/08/2026",
                "Cambio de aceite",
                "Cambio de aceite y revision general",
                350000
        );

        // Crear venta
        Venta venta = new Venta(
                "V001",
                cliente,
                vehiculo,
                "24/08/2026",
                95000000,
                "Credito"
        );

        // Crear compra
        Compra compra = new Compra(
                "C001",
                proveedor,
                vehiculo,
                "20/08/2026",
                80000000,
                "Transferencia"
        );

        // Crear sede
        Sede sede = new Sede(
                "S001",
                "Sede Principal",
                "Bogota",
                "Calle 100 #20-30",
                "6010000000"
        );

        // Crear transaccion
        Transaccion transaccion = new Transaccion(
                "T001",
                "INGRESO",
                95000000,
                "24/08/2026",
                "Venta vehiculo ACV123"
        );

        // Mostrar informacion
        vehiculo.mostrarInformacion();
        System.out.println();

        cliente.mostrarInformacion();
        System.out.println();

        proveedor.mostrarInformacion();
        System.out.println();

        mantenimiento.mostrarMantenimiento();
        System.out.println();

        venta.mostrarVenta();
        System.out.println();

        compra.mostrarCompra();
        System.out.println();

        sede.mostrarInformacion();
        System.out.println();

        transaccion.mostrarTransaccion();
        System.out.println();

        // Probar algunos metodos
        System.out.println("----- PRUEBAS -----");

        vehiculo.aplicarDescuento(10);
        System.out.println("Precio con 10% de descuento: $" + vehiculo.getPrecio());

        vehiculo.cambiarEstado("Vendido");
        System.out.println("Nuevo estado: " + vehiculo.getEstado());

        cliente.actualizarTelefono("3019999999");
        System.out.println("Nuevo telefono del cliente: " + cliente.getTelefono());

        venta.aplicarDescuento(5);
        System.out.println("Total de venta con descuento: $" + venta.calcularTotal());

        System.out.println("La transaccion es ingreso: " + transaccion.esIngreso());
        System.out.println("La transaccion es egreso: " + transaccion.esEgreso());
    }
}
