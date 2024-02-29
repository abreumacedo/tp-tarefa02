/* TAREFA 02
 * 
 * 1. Soma de Matrizes:
 *     Desenvolva um programa que realiza a soma de duas matrizes 3X3, 
 *     exibindo o resultado no console. 
 */

package br.edu.fatecpg.tarefa02;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner ler = new Scanner(System.in);
		  
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        int[][] mr = new int[3][3];
		
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                mr[l][c] =  m1[l][c] +  m2[l][c];
                System.out.println();
            }	
        }
        ler.close();
	}
}
