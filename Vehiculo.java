package sistema_de_consecionario_de_autos;


public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private String estado;

    public Vehiculo(String placa, String marca, String modelo,
                    double precio, String color, String estado) {

        if (precio < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo.");
        }

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.estado = estado;
    }

    // Método abstracto para aplicar polimorfismo
    public abstract String getTipoVehiculo();

    public void mostrarInformacion() {
        System.out.println("----- VEHICULO -----");
        System.out.println("Tipo: " + getTipoVehiculo());
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("Color: " + color);
        System.out.println("Estado: " + estado);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void aplicarDescuento(double porcentaje) {

        if (porcentaje < 0 || porcentaje > 100) {
            throw new PrecioInvalidoException(
                "El descuento debe estar entre 0 y 100."
            );
        }

        this.precio = this.precio - (this.precio * porcentaje / 100);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new PrecioInvalidoException(
                "El precio no puede ser negativo."
            );
        }

        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
