package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Estudiante> estudiantes;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Biblioteca \n[nombre=" + nombre + ", direccion=" + direccion + "]\n [bibliotecarios=" + bibliotecarios
                + "\n [Estudiantes=" + estudiantes + "]\n";
    }
    
    public void agregarBibliotecario (Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudiante (Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public static void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }
    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }
    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }
    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
