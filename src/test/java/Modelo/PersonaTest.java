/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose
 */

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona persona = new Persona(
                "Carlos Ramírez",
                "Carrera 45 #12-34",
                "3124567890",
                "1988-07-22"
        );

        assertEquals("Carlos Ramírez", persona.getNombre());
        assertEquals("Carrera 45 #12-34", persona.getDireccion());
        assertEquals("3124567890", persona.getTelefono());
        assertEquals("1988-07-22", persona.getFechaNacimiento());
    }

    @Test
    public void testToString() {
        Persona persona = new Persona(
                "Ana Torres",
                "Calle 10 #20-30",
                "3109876543",
                "1995-12-05"
        );

        String texto = persona.toString();

        // Validar que todos los datos estén presentes en la cadena resultante
        assertTrue(texto.contains("Ana Torres"));
        assertTrue(texto.contains("1995-12-05"));
        assertTrue(texto.contains("Calle 10 #20-30"));
        assertTrue(texto.contains("3109876543"));
    }
}
