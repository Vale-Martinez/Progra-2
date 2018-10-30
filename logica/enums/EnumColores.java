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
public enum EnumColores {

    ROJO('R', "Rojo", 1), AMARILLO('A', "Amarillo", 2), VERDE('V', "Verde", 3), EGRESO('E', "Egreso", 0);

    public char id;
    public String estado;
    public int prioridad;

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    private EnumColores(char id, String estado, int prioridad) {
        this.id = id;
        this.estado = estado;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "EnumColores{" + "id=" + id + ", estado=" + estado + ", prioridad=" + prioridad + '}';
    }

    public ArrayList<EnumColores> valores() {
        ArrayList<EnumColores> valores = new ArrayList<>();
        valores.addAll(Arrays.asList(EnumColores.values()));
        return valores;
    }

}
