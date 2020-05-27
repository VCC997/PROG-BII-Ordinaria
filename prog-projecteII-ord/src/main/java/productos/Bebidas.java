package productos;

import es.carbonell.Producto;

public class Bebidas extends Producto {

    private String tamaño;

    public Bebidas(int cod, String name, String desc, double price, float descuento, double iva, String tamaño) {
        super(cod, name, desc, price, descuento, iva);
        this.tamaño=tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+"Bebidas{" + "tamaño='" + tamaño + '\'' + '}';
    }
}
