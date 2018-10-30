/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.enums;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public enum EnumEnfermedad {

    INFARTO("Infarto", 'I', 0), PERDIDA_SANGRE_POR_HERIDA("Perdida_sangre_por_herida", 'H', 1), PARTO("Parto", 'P', 2), DOLOR_ESTOMACAL("Dolor_estomacal", 'D', 3), QUEBRADURA("quebradura", 'Q', 4), OTRO("otro", 'O', 5);

    public char id;
    public String nombre;
    public int prioridad;

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private EnumEnfermedad(String nombre, char id, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;

    }

    @Override
    public String toString() {
        return "EnumEnfermedad{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    public ArrayList<EnumEnfermedad> valores() {
        ArrayList<EnumEnfermedad> valores = new ArrayList<>();
        valores.addAll(Arrays.asList(EnumEnfermedad.values()));
        return valores;
    }

}
