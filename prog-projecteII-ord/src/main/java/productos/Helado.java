package productos;

import es.carbonell.Producto;

public class Helado extends Producto {

    public Helado(int cod, String name, String desc, double price, float descuento, double iva) {
        super(cod, name, desc, price, descuento, iva);
    }

    @Override
    public String toString() {
        return super.toString()+"Helado{}";
    }
}
