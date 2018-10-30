package logica.negocio.personas;

import logica.enums.EnumColores;
import logica.enums.EnumEnfermedad;

public class Persona implements Comparable<Persona> {

    private String Nombre;
    private String Edad;
    private String Fecha;
    private EnumColores Gravedad;
    private EnumEnfermedad Enfermedad;
    private String ficha;

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public EnumColores getGravedad() {
        return Gravedad;
    }

    public void setGravedad(EnumColores Gravedad) {
        this.Gravedad = Gravedad;
    }

    public EnumEnfermedad getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(EnumEnfermedad Enfermedad) {
        this.Enfermedad = Enfermedad;
    }

    public Persona(String Nombre, String Edad, String Fecha, EnumColores Gravedad, EnumEnfermedad Enfermedad, String ficha) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Fecha = Fecha;
        this.Gravedad = Gravedad;
        this.Enfermedad = Enfermedad;
        this.ficha = ficha;
    }

    public Persona(String Nombre, EnumEnfermedad Enfermedad) {
        this.Nombre = Nombre;
        this.Enfermedad = Enfermedad;
    }

    public Persona() {
    }

    @Override
    public int compareTo(Persona persona) {
        if (this.getEnfermedad().getPrioridad() < persona.getEnfermedad().getPrioridad()) {
            return -1;
        } else if (this.getEnfermedad().getPrioridad() == persona.getEnfermedad().getPrioridad()) {
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Gravedad=" + Gravedad + ", Enfermedad=" + Enfermedad + ", ficha=" + ficha + '}';
    }

}
