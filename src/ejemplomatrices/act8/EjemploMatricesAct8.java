/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrices.act8;

/**
 *
 * @author Dany
 */
public class EjemploMatricesAct8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Este programa promedia el contenido de las 
         posiciones pares y suma el contenido de las 
         posiciones nones de un arreglo
         */
        int promedio1, sumaPar = 0, sumaNon = 0, cont = 0;
        int[][] matrix = {{10, 30, 89, 48, 56},
                          {32, 23, 84, 20, 10},
                          {72, 108, 71, 402, 8}};
        //i inicia en 0, el ciclo se ejecuta mientra i<  tamaño del arreglo
        // i se incrementa de dos en dos
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j = j + 2) {
                sumaPar = sumaPar + matrix[i][j];
                cont++;
            }
        }
                promedio1 = sumaPar / cont;
        System.out.println("El promedio Par es= "+promedio1);
        for (int i=0; i < matrix.length; i++){
            for ( int j = 1; j<matrix[i].length; j = j+2) { 
                sumaNon = sumaNon + matrix[i][j];
                cont++;
            }
        }

        
        System.out.println("La suma de Nones es"+ sumaNon);
    }

}
