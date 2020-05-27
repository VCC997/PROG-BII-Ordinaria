package es.carbonell;

public class Pedido {

    private int id;
    private Producto producto;
    private String fechaPedido;
    private String nombreCliente;
    private boolean mesaServida;

    public Pedido(int id, Producto producto, String fechaPedido, String cliente, boolean mesaServida) {

        this.id = id;
        this.producto = producto;
        this.fechaPedido = fechaPedido;
        this.nombreCliente = cliente;
        this.mesaServida = mesaServida;
    }

    @Override
    public String toString() {
        return "id=" + id + ", productos=" + producto +
                ", fechaPedido='" + fechaPedido + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", mesaServida=" + mesaServida;
    }
}
