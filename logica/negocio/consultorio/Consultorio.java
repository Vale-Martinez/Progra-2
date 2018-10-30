/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.negocio.consultorio;
import logica.negocio.personas.Persona;
import logica.enums.EnumColores;
/**
 *
 * @author admin
 */
public class Consultorio {
private String nombre;
private Persona paciente;
private Boolean estado;
private EnumColores  tipo;

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public EnumColores getTipo() {
        return tipo;
    }

    public void setTipo(EnumColores tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Consultorio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consultorio(String nombre, EnumColores tipo) {
        this.nombre = nombre;
        this.paciente = null;
        this.estado = true;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Consultorio{" + "nombre=" + nombre + ", paciente=" + paciente + ", estado=" + estado + ", tipo=" + tipo + '}';
    }

   
    
    
    

    
}
