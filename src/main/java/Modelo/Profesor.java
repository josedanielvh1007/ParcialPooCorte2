/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class Profesor extends Persona {

    private final int cedula;
    private int pagoHora;
    private String asignatura;

    public Profesor(int cedula, int pagoMensual, String nombre, String direccion, int telefono, String fechaNacimiento, String asignatura) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.pagoHora = pagoMensual;
        this.asignatura = asignatura;
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
    
}
