/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura.interfaz;

        

public interface comportamientoEstructura<X> {
 
    public void agregar(X elemento);
    public X eliminar();
    public String toString();
    
    
}
