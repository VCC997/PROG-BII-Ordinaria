package es.carbonell;

public class Producto {

    private static int codigoActual =1;

    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private float descuento;
    private double iva;

    public Producto(int cod, String name, String desc, double price, float descuento, double iva) {

        this.codigo = codigoActual++;
        this.nombre = name;
        this.descripcion = desc;
        this.precio = price;
        this.descuento = 0.20f;
        this.iva = 0.21;
    }

    private double calcularPvp(double precio, float descuento, double iva) {

        double pvp = precio / (1 - (descuento / 100)) * iva;

        return pvp;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", Nombre='" + nombre + '\'' +
                ", Descripcion='" + descripcion + '\'' +
                ", Precio=" + precio + ", Descuento=" + descuento + ", IVA=" + iva;
    }
}
