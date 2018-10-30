/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura;

import logica.estructura.ColaNodo;
import logica.negocio.personas.Persona;
import logica.estructura.interfaz.comportamientoEstructura;
import logica.enums.EnumEnfermedad;

/**
 *
 * @author admin
 * @param <X>
 */
public class Cola<X> implements comportamientoEstructura<X> {

    private ColaNodo<X> inicio;
    private ColaNodo<X> fin;
    private EnumEnfermedad enfermedad;
    private int size;

    public ColaNodo<X> getInicio() {
        return inicio;
    }

    public void setInicio(ColaNodo<X> inicio) {
        this.inicio = inicio;
    }

    public ColaNodo<X> getFin() {
        return fin;
    }

    public void setFin(ColaNodo<X> fin) {
        this.fin = fin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public EnumEnfermedad getEnfermedad() {
        return enfermedad;

    }

    public void setEnfermedad(EnumEnfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean isVoid() {
        return size == 0;
    }

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }

    public Cola(ColaNodo<X> inicio, ColaNodo<X> fin, int size) {
        this.inicio = inicio;
        this.fin = fin;
        this.size = size;
    }

    @Override
    public void agregar(X elemento) {
        ColaNodo<X> nuevoNodo = new ColaNodo<>(elemento);
        if (isVoid()) {
            inicio = nuevoNodo;
            fin = inicio;
            size++;
        } else {
            fin.setNodoSig(nuevoNodo);
            fin.getNodoSig().setNodoAnt(fin);
            fin = fin.getNodoSig();
            size++;
        }

    }

    @Override
    public X eliminar() {
        return null;
        //return ;
    }

    public boolean esVacia() {
        return size == 0;
    }

    @Override
    public String toString() {
        ColaNodo<X> temp = inicio;
        String msg = "";
        for (int i = 0; i < size; i++) {

            msg += temp.toString();
            msg += "\n ";
            temp = temp.getNodoSig();
        }
        return msg;
    }

}

/**
 * public void eliminar(X elemento) { ColaNodo<X> aux1; ColaNodo<X> aux2, elim;
 * elim = consultar(elemento);
 *
 * if (size == 1) { inicio = null; fin = null; size--;
 *
 * } else if (inicio.getElemento().equals(elemento)) { ColaNodo<X> temp =
 * inicio; inicio = inicio.getNodoSig(); inicio.setNodoSig(null);
 * temp.setNodoSig(null); size--;
 *
 * } else if (fin.getElemento().equals(elemento)) { ColaNodo<X> temp = fin; fin
 * = fin.getNodoAnt(); fin.setNodoSig(null); temp.setNodoAnt(null); size--;
 *
 * } else { elim = consultar(elemento); aux1 = elim.getNodoAnt(); aux2 =
 * elim.getNodoSig(); aux1.setNodoSig(aux2); aux2.setNodoAnt(aux1);
 *
 * elim.setNodoAnt(null); elim.setNodoSig(null); size--; }
 *
 * }
 *
 *
 *
 * public ColaNodo<X> consultar(X elemento) { ColaNodo<X> temp = inicio; if
 * (!esVacia()) { for (int i = 0; i < size; i++) { if (temp.getElemento() ==
 * elemento) { System.out.println("ECONTRADO: " +
 * temp.getElemento().toString()); break; } else { temp = temp.getNodoSig(); } }
 * } return temp;
 *
 * }
 *
 *
 * public void modificar(X elemento) {
 *
 * }
 *
 *
 * public boolean isVoid() { return size == 0; }
 *
 *
 * public String toString() { ColaNodo<X> temp = inicio; String msg = ""; for
 * (int i = 0; i < size; i++) {
 *
 * msg += temp.toString(); msg += "\n "; temp = temp.getNodoSig(); } return msg;
 * }
 *
 * @Override public void ver(X elemento) { throw new
 * UnsupportedOperationException("Not supported yet."); //To change body of
 * generated methods, choose Tools | Templates.
    }*
 */
