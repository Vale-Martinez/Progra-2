/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura;

import java.util.Vector;
import logica.estructura.HeapNodo;
import logica.estructura.interfaz.comportamientoEstructura;
import logica.negocio.personas.Persona;

/**
 *
 * @author admin
 * @param <X>
 */
public class Heaps<X extends Comparable<X>> implements comportamientoEstructura<X> {

    //atributos 
    private Vector<X> vector;
    private HeapNodo<X> inicio;
    private HeapNodo<X> fin;
    private int size;

    //getters and setters
    public Vector<X> getVector() {
        return vector;
    }

    public void setVector(Vector<X> vector) {
        this.vector = vector;
    }

    public int getSize() {
        return this.vector.size();
    }

    public HeapNodo<X> getInicio() {
        return inicio;
    }

    public void setInicio(HeapNodo<X> inicio) {
        this.inicio = inicio;
    }

    public HeapNodo<X> getFin() {
        return fin;
    }

    public void setFin(HeapNodo<X> fin) {
        this.fin = fin;
    }
    

    //constructor
    public Heaps() {
        this.vector = new Vector<>();
    }

    //devuelve el valoro del padre en el arreglo 
    private int parentRoot(int indexPosition) {
        if (indexPosition == 0) {
            return -1;
        }
        return (indexPosition - 1) / 2;
    }

    @Override
    public void agregar(X element) {
        int i = vector.size();
        vector.add(element);
        int parent = parentRoot(i);
        while (parent != -1 && vector.get(i).compareTo(vector.get(parent)) < 0) {
            swapHeap(i, parent);
            i = parent;
            parent = parentRoot(i);
        }

    }

    @Override
    public X eliminar() {
        if (esVacia()) {
            return null;
        }
        if (vector.size() == 1) {
            return vector.remove(0);
        }
        X minValue = vector.get(0);
        X lastValue = vector.remove(vector.size() - 1);
        vector.set(0, lastValue);
        heapSortVector(0);
        return minValue;
    }

    //intercambia los valores de dos nodos en el arreglo
    private void swapHeap(int node1, int node2) {
        X temp = vector.get(node1);
        vector.set(node1, vector.get(node2));
        vector.set(node2, temp);
    }

    //mueve a la izquierda en el arreglo
    private int leftPosition(int indexPosition) {
        return 2 * indexPosition + 1;
    }

    //mueve a la derecha en el arreglo 
    private int rightPosition(int indexPosition) {
        return 2 * indexPosition + 2;
    }

    //Metodo que ordena el arreglo del heap con heaps sort
    private void heapSortVector(int i) {
        int leftPosition = leftPosition(i);
        int rightPosition = rightPosition(i);
        int smallestNode = i;
        if (leftPosition < vector.size() && vector.get(leftPosition).compareTo(vector.get(i)) < 0) {
            smallestNode = leftPosition;
        }
        if (rightPosition < vector.size() && vector.get(rightPosition).compareTo(vector.get(smallestNode)) < 0) {
            smallestNode = rightPosition;
        }
        if (smallestNode != i) {
            swapHeap(i, smallestNode);
            heapSortVector(smallestNode);
        }
    }

    //devuelve el to Srting 
    @Override
    public String toString() {
        String msg = "";
        for (int i = 0; i < vector.size(); i++) {
            msg += vector.get(i).toString() + "\n";
        }
        return msg;
    }

    private boolean esVacia() {
        return vector.size() == 0;
    }

}
