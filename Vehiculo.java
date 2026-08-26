public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private String color;
    private String estado;

    public Vehiculo(String placa, String marca, String modelo, int año, double precio, String color, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.color = color;
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("----- VEHICULO -----");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + añoo);
        System.out.println("Precio: $" + precio);
        System.out.println("Color: " + color);
        System.out.println("Estado: " + estado);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void aplicarDescuento(double porcentaje) {
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
