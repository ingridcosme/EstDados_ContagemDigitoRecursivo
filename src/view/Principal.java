/*
Criar uma aplica��o em Java que tenha uma fun��o recursiva que, recebendo um n�_
mero inteiro de 10 a 999999 e recebendo um 2� n�mero inteiro (de 0 a 9), tenha
uma fun��o recursiva que apresente quantas vezes o 2� n�mero aparece no primeiro
*/

package view;

import java.util.Scanner;

import controller.ContagemController;

public class Principal {

	public static void main(String[] args) {
		ContagemController cont = new ContagemController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Contagem de repeti��es de um algarismo em um n�mero\n");
		
		System.out.printf("Digite um n�mero entre 10 e 999999: ");
		int num = ler.nextInt();
		while(num < 10 || num > 999999) {
			System.out.printf("\nDigite um n�mero entre 10 e 999999: ");
			num = ler.nextInt();
		}
		
		System.out.printf("\nDigite um algarismo entre 0 e 9: ");
		int alg = ler.nextInt();
		while(alg < 0 || alg > 9) {
			System.out.printf("\nDigite um algarismo entre 0 e 9: ");
			alg = ler.nextInt();
		}
		
		ler.close();
		
		int result = cont.contagem(num, alg);
		
		if(result < 2) {
			System.out.printf("\nNo n�mero " + num+ " digitado, temos " + result 
					+ " algarismo " + alg);
		} else {
			System.out.printf("\nNo n�mero " + num+ " digitado, temos " + result 
					+ " algarismos " + alg);
		}
	}

}
