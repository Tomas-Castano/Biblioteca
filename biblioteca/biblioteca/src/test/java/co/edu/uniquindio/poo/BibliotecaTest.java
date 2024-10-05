package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BibliotecaTest{
   private static final Logger LOG = Logger.getLogger(BibliotecaTest.class.getName());
      @Test
   public void datosVacios () {
    LOG.info("Iniciando test datosVacios");

    Biblioteca biblioteca = new Biblioteca("Lectura", "Calle 11");

    Assertions.assertThrows(Throwable.class , ()-> new Biblioteca("", ""));

    LOG.info("Finalizando test datosVacios");
    }
}