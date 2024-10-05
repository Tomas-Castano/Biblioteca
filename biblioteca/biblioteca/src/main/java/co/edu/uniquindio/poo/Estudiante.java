package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Estudiante extends Persona{
   private int cantidadPrestamos;
   private LinkedList<Prestamo> prestamo;

public Estudiante(String nombre, String cedula, String telefono, String correo, int cantidadPrestamos) {
    super(nombre, cedula, telefono, correo);
    this.cantidadPrestamos = cantidadPrestamos;
    prestamo = new LinkedList<>();
}

public int getCantidadPrestamos() {
    return cantidadPrestamos;
}

public void setCantidadPrestamos(int cantidadPrestamos) {
    this.cantidadPrestamos = cantidadPrestamos;
}

public LinkedList<Prestamo> getPrestamo() {
    return prestamo;
}

public void setPrestamo(LinkedList<Prestamo> prestamo) {
    this.prestamo = prestamo;
}

@Override
public String toString() {
    return "Estudiante [nombre=" + nombre + ", cantidadPrestamos=" + cantidadPrestamos + ", cedula=" + cedula
            + ", telefono=" + telefono + ", correo=" + correo;
}
   
}
