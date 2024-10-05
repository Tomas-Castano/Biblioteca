package co.edu.uniquindio.poo;

//Hecho por Tomás Castaño Ortiz y Amerika Esmeralda Giraldo Gonzales

public class App {
    public static void main(String[] args) {
        //Biblioteca
        Biblioteca biblioteca = new Biblioteca("La lectura", "Avenida 13");

        //Bibliotecarios
        Bibliotecario Juan = new Bibliotecario("Juan", "1000000000", "000001", "Juan@gmail.com", 100.00);
        Bibliotecario Lucas = new Bibliotecario("Lucas", "2000000000", "000001", "Lucas@gmail.com", 0);

        //Estudiante
        Estudiante Pedro = new Estudiante("Pedro", "3000000000", "0000002", "Pedro@gmail.com", 0);

        //Creamos libros
        Libro libro = new Libro("Codigo improvisado", "1020-0102-2001", "Lucas Pedro", "Las desventuras", "La cueva");
        Libro libro2 = new Libro("Cualquier vaina", "1293-2392-1294", "Juanito", "Los pendejos", "no se");

        //Creamos los detalles del prestamo
        DetallePrestamo detallePrestamo = new DetallePrestamo(libro);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(libro2);

        //Creamos el prestamo
        Prestamo prestamo = new Prestamo("20 diciembre");
        prestamo.agregarDetalle(detallePrestamo);
        prestamo.agregarDetalle(detallePrestamo2);

        //Agregamos a la biblioteca los bibliotecarios y clientes
        biblioteca.agregarBibliotecario(Juan);
        biblioteca.agregarBibliotecario(Lucas);
        biblioteca.agregarEstudiante(Pedro);

        Biblioteca.mostrarMensaje(biblioteca.toString());
        Biblioteca.mostrarMensaje(prestamo.toString());
    }
}
