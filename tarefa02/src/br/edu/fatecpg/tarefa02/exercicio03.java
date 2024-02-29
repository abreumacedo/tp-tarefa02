/* TAREFA 02
 * 
 * 3. Desenvolva um código que realiza a transposição de uma matriz 
 *    (as colunas viram linhas e as linhas viram colunas).
 *    Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.
 *
 */

package br.edu.fatecpg.tarefa02;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);

        // Solicita aos usuários o tamanho da matriz
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = ler.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = ler.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        ler.close();
    }
}

