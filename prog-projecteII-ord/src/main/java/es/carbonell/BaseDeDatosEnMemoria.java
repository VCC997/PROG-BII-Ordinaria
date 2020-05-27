package es.carbonell;

import java.util.ArrayList;

public class BaseDeDatosEnMemoria {

    public ArrayList<Producto> obtenerTodos() {

        ArrayList<Producto> listaPedidos = new ArrayList<>();

        Producto p1 = new Producto(1, "Sushi", "sushi japones a mano", 15.0, 0.20f, 0.21);
        listaPedidos.add(p1);
        Producto p2 = new Producto(2, "Shitake", "setas japones", 10.0, 0.10f, 0.21);
        listaPedidos.add(p2);
        Producto p3 = new Producto(3, "Ramen", "Sopa con carne de cerdo", 15.0, 0.05f, 0.21);
        listaPedidos.add(p3);
        Producto p4 = new Producto(4, "Gyhoza", "Pasta de carne e verdura", 12.0, 0.05f, 0.21);
        listaPedidos.add(p4);
        Producto p5 = new Producto(5, "Langostino", "Molusco", 15.0, 0.10f, 0.21);
        listaPedidos.add(p5);
        Producto p6 = new Producto(6, "Ensalada", "verduras", 5.0, 0.05f, 0.21);
        listaPedidos.add(p6);
        Producto p7 = new Producto(7, "Ensaladilla", "ensaladilla rusa", 4.0, 0.05f, 0.21);
        listaPedidos.add(p7);
        Producto p8 = new Producto(8, "Shasimi", "salmón o atún crudo en filetitos", 8.0, 0.10f, 0.21);
        listaPedidos.add(p8);
        Producto p9 = new Producto(9, "Pollo agridulce", "pechuga con salsa agridulce", 7.25, 0.05f, 0.21);
        listaPedidos.add(p9);
        Producto p10 = new Producto(10, "Tempura", "verduras al vapor", 7.55, 0.10f, 0.21);
        listaPedidos.add(p10);
        Producto p11 = new Producto(11, "Salmón plancha", "filete de salmón a la plancha", 10.0, 0.15f, 0.21);
        listaPedidos.add(p11);
        Producto p12 = new Producto(12, "Ensalda algas", "ensalada de alga konbu", 3.0, 0.03f, 0.21f);
        listaPedidos.add(p12);
        Producto p13 = new Producto(13, "fideos curry", "fideos pasta arroz con salsa curry", 10.0, 0.05f, 0.21);
        listaPedidos.add(p13);
        Producto p14 = new Producto(14, "bolas carne", "bolas de pasta con ternera al horno", 12.0, 0.10f, 0.21);
        listaPedidos.add(p14);
        Producto p15 = new Producto(15, "arroz curry", "arroz con salsa curry", 8.0, 0.07f, 0.21);
        listaPedidos.add(p15);
        Producto p16 = new Producto(16, "Gambas", "gambas placha", 5.0, 0.03f, 0.21);
        listaPedidos.add(p16);
        Producto p17 = new Producto(17, "ostras", "vieiras", 20.0, 0.10f, 0.21);
        listaPedidos.add(p17);
        Producto p18 = new Producto(18, "helado", "helado de chocolate", 2.50, 0.2f, 0.21);
        listaPedidos.add(p18);
        Producto p19 = new Producto(19, "brownie", "bizcocho de chocolate", 3.0, 0.02f, 0.21);
        listaPedidos.add(p19);
        Producto p20 = new Producto(20, "Té ", "té verde, rojo , etc...", 2.0, 0.02f, 0.21);
        listaPedidos.add(p20);

        return listaPedidos;
    }
}
