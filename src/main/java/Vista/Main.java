/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelo.*;

/**
 *
 * @author jose
 */
public class Main {

    ArrayList<Docente> docentes = new ArrayList<>();
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    private void run() {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de notas");
        int option;
        do {
            option = Integer.parseInt(
                    JOptionPane.showInputDialog("""
                                            Menu : 
                                            1. Añadir docente.
                                            2. Añadir estudiante.
                                            3. Listar docentes.
                                            4. Listar estudiantes.
                                            5. Calcular pagos.
                                            6. Resumen.
                                            7. Cargar datos de ejemplo.
                                            0. Salir."""));
            switch (option) {
                case 1 ->
                    anadirDocente();
                case 2 ->
                    anadirEstudiante();

            }
        } while (option != 0);
    }

    /*
    public Docente(int cedula, int pagoMensual, String nombre, String direccion, String telefono, String fechaNacimiento, String asignatura, int horasTrabajadas, int totalClases) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.pagoHora = pagoMensual;
        this.asignatura = asignatura;
        this.pagos = calcularPagos(horasTrabajadas, totalClases, this.pagoHora);
    }
     */
    private Persona anadirPersona() {
        String nombre = JOptionPane.showInputDialog("Nombre");
        String direccion = JOptionPane.showInputDialog("Direccion");
        String telefono = JOptionPane.showInputDialog("Telefono");
        String fechaNacimiento = JOptionPane.showInputDialog("Fecha nacimiento ( dd-mm-yyyy )");
        return new Persona(nombre, direccion, telefono, fechaNacimiento);
    }

    private void anadirDocente() {
        Persona base = anadirPersona();

        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Número de cédula"));
        String asignatura = JOptionPane.showInputDialog("Asignatura");
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas"));
        int totalClases = Integer.parseInt(JOptionPane.showInputDialog("Total clases"));
        int pagoMensual = Integer.parseInt(JOptionPane.showInputDialog("Pago mensual"));

        docentes.add(new Docente(
                cedula,
                pagoMensual,
                base.getNombre(),
                base.getDireccion(),
                base.getTelefono(),
                base.getFechaNacimiento(),
                asignatura,
                horasTrabajadas,
                totalClases
        ));
    }

    private void anadirEstudiante() {
        Persona base = anadirPersona();

        int grado = Integer.parseInt(JOptionPane.showInputDialog("Grado"));

        estudiantes.add(new Estudiante(
                base.getNombre(),
                base.getDireccion(),
                base.getTelefono(),
                base.getFechaNacimiento(),
                grado
        ));
    }

}
