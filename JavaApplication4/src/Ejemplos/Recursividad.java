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

public class Recursividad {
  
  static int[] ordenarVector(int p, int q, int[] v) {
    final int N = Math.abs(p - q) + 1;
    int[] result = new int[N];
    
    //Math.abs retorna el valor absoluto de la resta p-q
    
    // Caso Base
    
    if (Math.abs(p - q) == 1) {
      if (v[p] > v[q]) {
        result[0] = v[q];
        result[1] = v[p];
      } else {
        result[0] = v[p];
        result[1] = v[q];
      }
    } else { // Subproblemas
      
      int[] izq = ordenarVector(p, (p + q) / 2, v);
      int[] der = ordenarVector(((p + q) / 2) + 1, q, v);
      result = combinar(izq, der, N);
    }
    return (result);
  }
  
  static int[] combinar(int[] izq, int[] der, final int N) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] result = new int[N]; 
    while ((i != izq.length) && (j != der.length)) {
      if (izq[i] < der[j]) {
        result[k] = izq[i];
        i++;
      } else {
        result[k] = der[j];
        j++;
      }
      k++;
    }
    if (i != izq.length) {
      while (i != izq.length) {
        result[k] = izq[i];
        k++;
        i++;
      }
    } else {
      while (j != der.length) {
        result[k] = der[j];
        k++;
        j++;
      }
    }
    return (result);
  }
}
