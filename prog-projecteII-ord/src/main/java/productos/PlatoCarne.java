package productos;

import es.carbonell.Producto;

public class PlatoCarne extends Producto {

    private String tipo;

    public PlatoCarne(int cod, String name, String desc, double price, float descuento, double iva, String tipo) {
        super(cod, name, desc, price, descuento, iva);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"PlatoCarne{" + "tipo='" + tipo + '\'' + '}';
    }
}
