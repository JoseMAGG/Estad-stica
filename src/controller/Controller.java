/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Estadistica;
import model.CollectionManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public abstract class Controller {

    private static ArrayList<Integer> array;
    public static int sumaElementos;

    public static DefaultTableModel getTableModel(DefaultTableModel tableModel,
            int size) {
        array = CollectionManager.generarArrayListAleatorio(size);
        sumaElementos = CollectionManager.sumaElementos(array);
        int posicion;
        tableModel.setRowCount(0);
        for (int i = 0; i < size; i++) {
            posicion = i + 1;
            tableModel.addRow(new Object[]{posicion, array.get(i)});
        }
        return tableModel;
    }

    public static double estadisticaMedia() {
        return Estadistica.media(array);
    }

    public static int estadisticaModa() {
        return Estadistica.moda(array);
    }
    
    public static double estadisticaMediana() {
        return Estadistica.mediana(array);
    }
    
    public static double estadisticaDesEstandar() {
        return Estadistica.desviacionEstandar(array);
    }
    
    public static double estadisticaVarianza(){
        return Estadistica.varianza(array);
    }
    
    public static double estadisticaDesMedia() {
        return Estadistica.desviacionMedia(array);
    }
}
