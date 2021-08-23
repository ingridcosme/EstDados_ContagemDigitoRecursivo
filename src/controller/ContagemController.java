/*
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um nú_
mero inteiro de 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9), tenha
uma função recursiva que apresente quantas vezes o 2º número aparece no primeiro
*/

package controller;

public class ContagemController {

	public ContagemController() {
		super();
	}
	
	public int contagem(int num, int alg) {
		int digito = num % 10;  //Recebe o último digíto do número
		int aux = num / 10;  //Recebe o número sem o último digíto (próximo número a ser usado)
		int soma;  //Recebe a contagem das comparações verdadeiras
		
		if(aux == 0) {  //Condição de parada
			/*Quando o número só tem um digíto a ser comparado*/
			if(digito == alg) {  //Se o digíto for igual ao algarismo de comparação, contar +1
				return 1;
			} else {
				return 0;
			}
		} else {
			if(digito == alg) {
				/*Caso o último digíto do número seja igual ao algarismo, o retorno é dado 
				 * pelo incremento de 1 mais a chamada da função com o número retirado o 
				 * seu último digíto e com o algarismo para comparação*/
				soma = 1 + contagem(aux, alg);
			} else {
				/*Caso o último digíto do número não seja igual ao algarismo, o retorno é 
				 * dado pela chamada da função com o número retirado o seu último digíto 
				 * e com o algarismo para comparação*/
				soma = contagem(aux, alg);
			}
		}
		
		return soma;
	}

}
