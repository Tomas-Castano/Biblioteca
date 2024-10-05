package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    private static final Logger LOG = Logger.getLogger(PersonaTest.class.getName());

    /*
     * Test para comprobar que el numero de digitos colocados en la cedula sean 10
     */
    @Test
    public void digitosCompletos(){
        LOG.info("Inicio de prueba de digitosCompletos");

        Persona persona = new Persona("Pedro", "3000000000", "0000002", "Pedro@gmail.com");

        LOG.info("Fin de prueba de digitosCompletos");
    }
}
