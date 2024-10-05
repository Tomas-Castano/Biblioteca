package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Prestamo {
    private String fechaLimite;
    private int cantidadLibros;
    private LinkedList<DetallePrestamo> detalles;

    public Prestamo(String fechaLimite) {
        this.fechaLimite = fechaLimite;
        detalles = new LinkedList<>();
        this.cantidadLibros = agregarDetalle(null);
    }

    public LinkedList<DetallePrestamo> getDetalles() {
        return detalles;
    }

    public void setDetalles(LinkedList<DetallePrestamo> detalles) {
        this.detalles = detalles;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    @Override
    public String toString() {
        return "Prestamo [fechaLimite=" + fechaLimite + ", cantidadLibros=" + cantidadLibros + ", detalles=" + detalles
                + "]";
    }

    public int agregarDetalle (DetallePrestamo detalle) {
        int numeroLibros = 0;
        detalles.add(detalle);
        numeroLibros ++;
        return numeroLibros;
    }
}
