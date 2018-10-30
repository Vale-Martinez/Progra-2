/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.estructura;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ModeladorDeTablas {
  
private static DefaultTableModel modelo;

   
    public static DefaultTableModel generarModeloDeTabla(int columnas, Object[] identificadores) {
        DefaultTableModel modeloGenerico = new DefaultTableModel();
        modeloGenerico.setColumnCount(columnas);
        modeloGenerico.setColumnIdentifiers(identificadores);
        return modeloGenerico;
    }

    
    public static void vaciarTabla(JTable nombre_tabla) {
        modelo = (DefaultTableModel) nombre_tabla.getModel();
        modelo.getDataVector().removeAllElements();
    }

  
    public static void nuevaFila(JTable nombre_tabla, Object[] filaNueva) {
        modelo = (DefaultTableModel) nombre_tabla.getModel();
        modelo.addRow(filaNueva);
    }

    
    public static String obtenerValorCelda(JTable nombre_tabla, int fila, int columna) {
        return (String) nombre_tabla.getValueAt(fila, columna);
    }
    
}
