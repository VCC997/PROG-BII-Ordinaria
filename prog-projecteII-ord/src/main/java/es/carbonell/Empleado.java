package es.carbonell;

public class Empleado {

    private String dni;
    private String nombre;
    private double sueldo;

    public Empleado(String dni, String nombre, double sueldo) {

        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) obj;
        return empleado.dni.equalsIgnoreCase(empleado.dni);
    }

    @Override
    public String toString() {
        return "DNI" + dni + "\t" + "Nombre:" + nombre + "\t" + "Sueldo:" + sueldo;
    }
}
