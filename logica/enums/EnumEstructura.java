/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.enums;

/**
 *
 * @author admin
 */
public enum EnumEstructura {
    HEAP('H',"Heap"),COLA('C',"Cola");
    public char  id;
    public String estado;

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

    private EnumEstructura(char id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EnumPaciente{" + "id=" + id + ", estado=" + estado + '}';
    }
    
    
}
