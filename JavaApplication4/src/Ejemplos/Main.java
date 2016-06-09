/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import static Ejemplos.Recursividad.ordenarVector;

/**
 *
 * @author Ivi Iván
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursividad rec=new Recursividad();
        RecursividadMax recMax=new RecursividadMax();
        int[] vector = {5, 9, 1, 10, 7, 3, 8, 4};
        vector = rec.ordenarVector(0, vector.length - 1, vector);
        for (int i = 0; i != vector.length; i++)
        {
            System.out.print(vector[i] + "");
        }
        recMax.Maximo(vector);
        for (int i = 0; i != vector.length; i++)
        {
            System.out.print(vector[i] + " ");
        }
        
  }
    
}
