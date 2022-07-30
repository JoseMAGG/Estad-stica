/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 *
 * @author Jose
 */
public abstract class CollectionManager {

    public static ArrayList<Integer> generarArrayListAleatorio(int size) {
        ArrayList<Integer> retorno = new ArrayList<>();
        Random aleatorio;
        int numeroAleatorio;
        for (int i = 0; i < size; i++) {
            aleatorio = new Random();            
            numeroAleatorio = aleatorio.nextInt(50);
            retorno.add(numeroAleatorio);
        }        
        return retorno;
    }

    public static int sumaElementos(Collection<Integer> colec) {
        int suma = 0;
        for (Integer num : colec) {
            suma += num;
        }
        return suma;
    }
    
    public static int contarNumero(int num, Collection<Integer> colec) {
        int contador = 0;
        for (Integer e : colec) {
            if (e == num) {
                contador++;
            }
        }
        return contador;
    }
    
    public static ArrayList<Integer> arrayListOf(Collection<Integer> colec){
        int size = colec.size();
        ArrayList<Integer> array = new ArrayList<>();
        for(Integer num : colec){
            array.add(num);
        }
        return array;
    }
}
