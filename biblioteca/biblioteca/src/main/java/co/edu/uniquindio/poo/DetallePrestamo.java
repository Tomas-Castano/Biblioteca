package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private Libro libro;

    public DetallePrestamo(Libro libro) {
        this.libro = libro;
        
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    @Override
    public String toString() {
        return "Detalle del Prestamo incluye [" + libro + "]";
    }


}
