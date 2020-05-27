package es.carbonell;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catalogo {

    private String cod;
    private Catalogo[][] estantes;
    private int num;
    private int choose;
    private boolean salir = false;
    private Scanner scanner = new Scanner(System.in);

    public Catalogo(String cod, Catalogo[][] estantes, int num, int choose, boolean salir, Scanner scanner) {

        this.cod = cod;
        this.estantes = estantes;
        this.num = num;
        this.choose = choose;
        this.salir = salir;
        this.scanner = scanner;
    }

    public void Menu() {
        do {
            try {
                System.out.println("---MENU---");
                System.out.println("1 - Listar todos los productos");
                System.out.println("2 - Realizar busqueda de un producto");
                System.out.println("3 - Hacer pedido nuevo");
                System.out.println("4 - Ver ordenes");
                System.out.println("5 - Ver pedido");
                System.out.println("6 - Servir Pedido");
                System.out.println("7 - Salir");
                choose = scanner.nextInt();

                switch (choose) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println(" Solo se puede seleccionar valores del 1 al 7 ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error con la introducción de datos");
                scanner.next();
            }
        } while (!salir);

        System.out.println("Fin Menu");
    }

    private void listarTodos(){

    }

    public String buscar(String cod){

        boolean encontrado = false;
        for (int i = 0; i < estantes.length; i++) {
            for (int j = 0; j < estantes[0].length ; j++) {

                if(estantes[i][j]!= null){
                    estantes[i][j].getCodigo()==cod;
                    encontrado =true;
                }
            }
        }if (encontrado){
            System.out.println("Pedido añadido");
        } else {
            System.out.println("No se ha podido añadir el pedido");
        }
        return cod;
    }

    public void atenderCliente(Catalogo b){

        boolean encontrado = false;

        for (int i = 0; i < estantes.length; i++) {
            for (int j = 0; j < estantes[0].length ; j++) {

                if(estantes[i][j]== null){
                    estantes[i][j]= b;
                    encontrado =true;
                }
            }
        }
        if (encontrado){
            System.out.println("Pedido añadido");
        } else {
            System.out.println("No se ha podido añadir el pedido");
        }
    }

    public void listarOrdenes(){

    }

    public void verPedido(){

    }

    public void servirPedido(){

    }
}
