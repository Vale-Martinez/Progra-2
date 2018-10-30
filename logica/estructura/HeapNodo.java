/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura;

/**
 *
 * @author admin
 * @param <X>
 */
public class HeapNodo<X> {
    private X elemento;
    private HeapNodo<X> hijoDerecho;
    private HeapNodo<X> hijoIzquierdo;
    private HeapNodo<X> raiz;
    private int dato;

    public HeapNodo<X> getRaiz() {
        return raiz;
    }

    public void setRaiz(HeapNodo<X> raiz) {
        this.raiz = raiz;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public X getElemento() {
        return elemento;
    }

    public void setElemento(X elemento) {
        this.elemento = elemento;
    }

    public HeapNodo<X> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(HeapNodo<X> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public HeapNodo<X> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(HeapNodo<X> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public HeapNodo<X> getPadre() {
        return raiz;
    }

    public void setPadre(HeapNodo<X> padre) {
        this.raiz = padre;
    }

    public HeapNodo(X elemento) {
        this.elemento = elemento;
    }

    public HeapNodo(X elemento, HeapNodo<X> hijoDerecho, HeapNodo<X> hijoIzquierdo, HeapNodo<X> raiz, int dato) {
        this.elemento = elemento;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.raiz = null;
        this.dato = dato;
    }

    public HeapNodo() {
    }
    

    @Override
    public String toString() {
        return "HeapNodo{" + "elemento=" + elemento + ", hijoDerecho=" + hijoDerecho + ", hijoIzquierdo=" + hijoIzquierdo + ", raiz=" + raiz + ", dato=" + dato + '}';
    }

    
    


    
    
}
