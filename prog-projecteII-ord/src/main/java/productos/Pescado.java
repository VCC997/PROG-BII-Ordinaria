package productos;

import es.carbonell.Producto;

public class Pescado extends Producto {

    private String tipo;

    public Pescado(int cod, String name, String desc, double price, float descuento, double iva, String tipo) {
        super(cod, name, desc, price, descuento, iva);
        this.tipo =tipo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Salmon{" + "tipo='" + tipo + '\'' + '}';
    }
}

