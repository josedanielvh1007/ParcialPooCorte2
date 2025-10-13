/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Docente extends Persona {

    private final int cedula;
    private int pagoHora;
    private String asignatura;
    private double[] pagos;

    public Docente(int cedula, int pagoMensual, String nombre, String direccion, int telefono, String fechaNacimiento, String asignatura, int horasTrabajadas, int totalClases) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.pagoHora = pagoMensual;
        this.asignatura = asignatura;
        this.pagos = calcularPagos(horasTrabajadas, totalClases, this.pagoHora);
    }

    public int getCedula() {
        return cedula;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  - Cédula : " + cedula
                + "\n  - Pago hora : " + pagoHora
                + "\n  - Asignatura : " + asignatura;
    }

    private static double[] calcularPagos(int horasTrabajadas, int totalClases, double pagoHora) {
        double[] pagos = new double[2];
        pagos[0] = (pagoHora * horasTrabajadas) + (0.2 * totalClases); // Pago al docente
        pagos[1] = 0.17 * pagos[0];
        return pagos;
    }

    public void recalcularPagos(int horasTrabajadas, int totalClases) {
        this.pagos = Docente.calcularPagos(horasTrabajadas, totalClases, this.pagoHora);
    }

    public double[] getPagos() {
        return pagos;
    }
}
