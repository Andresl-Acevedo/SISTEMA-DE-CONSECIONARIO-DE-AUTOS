

Este proyecto es un programa hecho en Java para representar de forma sencilla el funcionamiento de una empresa que compra y vende vehículos.

La idea principal fue crear diferentes clases para guardar y manejar la información que se podría encontrar en este tipo de negocio. Por ejemplo, tenemos vehículos, clientes, proveedores, ventas, compras y mantenimientos.

El proyecto se realizó principalmente para practicar los conceptos de **Programación Orientada a Objetos** y entender mejor cómo se pueden relacionar diferentes clases entre sí.

## Clases

El proyecto cuenta con las siguientes clases:

* **Vehiculo:** guarda datos como la placa, marca, modelo, año, precio, color y estado del vehículo. También se puede cambiar su estado y aplicar descuentos.
* **Cliente:** guarda la información básica de un cliente y permite actualizar su teléfono.
* **Proveedor:** contiene los datos de un proveedor y permite actualizar su información de contacto.
* **Mantenimiento:** guarda los datos de los mantenimientos que se le realizan a un vehículo, incluyendo el costo.
* **Venta:** relaciona un cliente con un vehículo y registra datos de la venta, como el precio, la fecha y el método de pago.
* **Compra:** relaciona un proveedor con un vehículo y guarda la información de la compra.
* **Sede:** contiene la información de una sede, como su ciudad, dirección y teléfono.
* **Transaccion:** permite registrar un ingreso o un egreso y comprobar de qué tipo es.
* **Main:** es donde se crean los objetos y se prueban las diferentes funciones del programa.

## Qué conceptos se aplicaron?

Durante el desarrollo se utilizaron varios conceptos básicos de Programación Orientada a Objetos, entre ellos:

* Creación de clases y objetos.
* Atributos privados.
* Constructores.
* Métodos.
* Encapsulamiento.
* Getters y setters.
* Relación entre diferentes clases.

Por ejemplo, una `Venta` tiene un `Cliente` y un `Vehiculo`, por lo que las clases no funcionan solamente de manera independiente, sino que también se pueden relacionar entre ellas.

## Acciones

El programa permite probar diferentes acciones, como:

* Ver la información de un vehículo.
* Aplicarle un descuento al vehículo.
* Cambiar su estado.
* Actualizar el teléfono de un cliente.
* Actualizar los datos de contacto de un proveedor.
* Registrar información de mantenimientos.
* Registrar compras y ventas.
* Mostrar la información de una sede.
* Crear una transacción y comprobar si es un ingreso o un egreso.

En el `Main` se hicieron varias pruebas para comprobar que estos métodos funcionaran correctamente.

* Java
* NetBeans
* Programación Orientada a Objetos

