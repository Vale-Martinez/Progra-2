/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura;

/**
 *
 * @author admin
 */
public class ColaNodo<X> {

    private X elemento;
    private int prioridad;
    private ColaNodo<X> nodoSig;
    private ColaNodo<X> nodoAnt;

    public X getElemento() {
        return elemento;
    }

    public void setElemento(X elemento) {
        this.elemento = elemento;
    }

    public ColaNodo<X> getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(ColaNodo<X> nodoSig) {
        this.nodoSig = nodoSig;
    }

    public ColaNodo<X> getNodoAnt() {
        return nodoAnt;
    }

    public void setNodoAnt(ColaNodo<X> nodoAnt) {
        this.nodoAnt = nodoAnt;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.prioridad = Prioridad;
    }

    public ColaNodo(X elemento) {
        this.elemento = elemento;

    }

    public ColaNodo() {
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + '}';
    }

}
