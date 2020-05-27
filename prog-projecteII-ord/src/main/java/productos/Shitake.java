package productos;

import es.carbonell.Producto;

public class Shitake extends Producto {

    public Shitake(int cod, String name, String desc, double price, float descuento, double iva) {
        super(cod, name, desc, price, descuento, iva);
    }

    @Override
    public String toString() {
        return super.toString()+"Shitake{}";
    }
}
