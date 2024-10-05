package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona{
    private double salario;
    private LinkedList<Prestamo> prestamo;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        prestamo = new LinkedList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", telefono="
                + telefono + ", correo=" + correo + "] \n";
    }

    public LinkedList<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(LinkedList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }


}
