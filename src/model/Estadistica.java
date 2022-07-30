/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jose
 */
public abstract class Estadistica {
    
    public static double media(Collection<Integer> colec) {
        double media = 0;
        int totalNumeros = colec.size();
        int suma = CollectionManager.sumaElementos(colec);
        media = suma / totalNumeros;
        return media;
    }
    
    public static int moda(Collection<Integer> colec) {
        int moda = 0, numeroVeces = 0;
        ArrayList<Integer> visitados = new ArrayList<>();
        for (Integer num : colec) {
            if (!visitados.contains(num)) {
                visitados.add(num);
                int aux = CollectionManager.contarNumero(num, colec);
                if (aux > numeroVeces) {
                    moda = num;
                    numeroVeces = aux;
                }
            }
        }
        return moda;
    }
    
    public static double mediana(Collection<Integer> colec) {
        double mediana = 0;
        int size = colec.size();
        ArrayList<Integer> arregloNumeros = CollectionManager.arrayListOf(colec);
        arregloNumeros.sort(null);
        if (size % 2 == 0) {
            mediana = (arregloNumeros.get((size / 2) - 1) + arregloNumeros.get((size / 2))) / 2;
        } else {
            mediana = arregloNumeros.get(((size + 1) / 2) - 1);
        }
        return mediana;
    }
    
    public static double desviacionEstandar(Collection<Integer> colec) {
        float sumatoria = CollectionManager.sumaElementos(colec);
        double desviacionEstandar = Math.sqrt(sumatoria / colec.size());
        
        return desviacionEstandar;
    }
    
    public static double varianza(Collection<Integer> colec) {
        double desEst = desviacionEstandar(colec);
        return Math.pow(desEst, 2);
    }
    
    public static double desviacionMedia(Collection<Integer> colec) {
        double media = media(colec);
        double sumatoria = 0;
        for (Integer num : colec) {
            sumatoria += Math.abs(num - media);
        }
        return sumatoria / colec.size();
    }
    
}
