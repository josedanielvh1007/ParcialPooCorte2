/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class Estudiante extends Persona {
    private int grado;

    public Estudiante(String nombre, String direccion, int telefono, String fechaNacimiento, int grado) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  - Grado : " + grado;
    }
    
}
