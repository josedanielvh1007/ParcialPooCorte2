/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jose
 */
public class Persona {
    
    protected final String nombre;
    protected final String direccion;
    protected final int telefono;
    protected final String fechaNacimiento;

    public Persona(String nombre, String direccion, int telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    @Override 
    public String toString() {
        return nombre + ": \n" + 
                "  - Fecha de Nacimiento : " +  this.fechaNacimiento + 
                "\n  - Dirección : " + this.direccion + 
                "\n  - Telefono : " + this.telefono;
    }
}
