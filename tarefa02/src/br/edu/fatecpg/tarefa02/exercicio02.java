/* TAREFA 02
 * 
 * 2. Multiplicação de Matriz por Escalar:
 *    Crie um programa que verifique se um login e senha
 *    confere com os dados de uma matriz 6x2
 * 
 */

package br.edu.fatecpg.tarefa02;

import java.util.Scanner;

public class exercicio02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner ler = new Scanner(System.in);

    String[][] banco = new String[6][2];

    String login, senha;

    boolean loginValido = false;

    System.out.println("CADASTRAR USUARIOS: ");

    int i = 1;

    for (int l = 0; l <= 5; l++) {
      for (int c = 0; c < 2; c++) {

        if (c % 2 == 0) {

          System.out.println("Cadastre o " + i + "- nome do usuario: ");
          banco[l][c] = ler.next();
        } else {
          System.out.println("Cadastre o " + i + "- senha do usuario: ");
          banco[l][c] = ler.next();
        }
      }
      
      i++;
    }

    do {
    	
      System.out.print("Digite o nome do usuario: ");
      login = ler.next();

      System.out.print("Digite a senha: ");
      senha = ler.next();

      for (int l = 0; l <= 5; l++) {
        if (login.equals(banco[l][0]) && senha.equals(banco[l][1])) {
          loginValido = true;
        }
      }
      
      if (loginValido) {
        System.out.println("Acesso permitido");
      } else {
        System.out.println("Acesso negado");
      }
      
    } while (!loginValido);
    ler.close();
  }

}