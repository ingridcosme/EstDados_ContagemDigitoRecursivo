/*
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um nú_
mero inteiro de 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9), tenha
uma função recursiva que apresente quantas vezes o 2º número aparece no primeiro
*/

package view;

import java.util.Scanner;

import controller.ContagemController;

public class Principal {

	public static void main(String[] args) {
		ContagemController cont = new ContagemController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Contagem de repetições de um algarismo em um número\n");
		
		System.out.printf("Digite um número entre 10 e 999999: ");
		int num = ler.nextInt();
		while(num < 10 || num > 999999) {
			System.out.printf("\nDigite um número entre 10 e 999999: ");
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
			System.out.printf("\nNo número " + num+ " digitado, temos " + result 
					+ " algarismo " + alg);
		} else {
			System.out.printf("\nNo número " + num+ " digitado, temos " + result 
					+ " algarismos " + alg);
		}
	}

}
