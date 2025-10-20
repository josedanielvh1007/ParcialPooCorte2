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

public class DocenteIT {

    private Docente docente;

    @BeforeEach
    public void setUp() {
        docente = new Docente(
                12345,                // cédula
                50000,                // pagoHora
                "Juan Pérez",         // nombre
                "Calle 123",          // dirección
                "3001234567",         // teléfono
                "1985-10-15",         // fechaNacimiento
                "Matemáticas",        // asignatura
                40,                   // horasTrabajadas
                10                    // totalClases
        );
    }

    @Test
    public void testConstructorYGetters() {
        assertEquals(12345, docente.getCedula());
        assertEquals(50000, docente.getPagoHora());
        assertEquals("Matemáticas", docente.getAsignatura());
        assertNotNull(docente.getPagos());
        assertEquals(2, docente.getPagos().length);
    }

    @Test
    public void testCalculoInicialPagos() {
        double[] pagos = docente.getPagos();
        double esperadoPagoBase = (50000 * 40) + (0.2 * 10);
        double esperadoRetencion = 0.17 * esperadoPagoBase;

        assertEquals(esperadoPagoBase, pagos[0], 0.01);
        assertEquals(esperadoRetencion, pagos[1], 0.01);
    }

    @Test
    public void testRecalcularPagos() {
        docente.recalcularPagos(20, 5);
        double[] pagos = docente.getPagos();
        double esperadoPagoBase = (50000 * 20) + (0.2 * 5);
        double esperadoRetencion = 0.17 * esperadoPagoBase;

        assertEquals(esperadoPagoBase, pagos[0], 0.01);
        assertEquals(esperadoRetencion, pagos[1], 0.01);
    }

    @Test
    public void testSetters() {
        docente.setAsignatura("Física");
        docente.setPagoHora(60000);

        assertEquals("Física", docente.getAsignatura());
        assertEquals(60000, docente.getPagoHora());
    }

    @Test
    public void testToString() {
        String texto = docente.toString();
        assertTrue(texto.contains("Juan Pérez"));
        assertTrue(texto.contains("Cédula"));
        assertTrue(texto.contains("Matemáticas"));
    }
}
