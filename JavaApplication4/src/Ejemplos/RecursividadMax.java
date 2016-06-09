/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author Ivi Iván
 */
public class RecursividadMax {
    public static int Maximo(int[] a)
    {
        return Maximo(a, 0,a.length-1);
    }
    static int Maximo(int[] a, int inf, int sup)
    {
        if(inf==sup)return a[inf];
        int medio=(inf+sup)/2;
        int maxIzq=Maximo(a, inf, medio);
        int maxDer=Maximo(a, medio+1, sup);
        return Math.max(maxIzq, maxDer);
    }
    
}
