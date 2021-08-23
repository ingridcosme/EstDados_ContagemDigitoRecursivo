/*
Criar uma aplica��o em Java que tenha uma fun��o recursiva que, recebendo um n�_
mero inteiro de 10 a 999999 e recebendo um 2� n�mero inteiro (de 0 a 9), tenha
uma fun��o recursiva que apresente quantas vezes o 2� n�mero aparece no primeiro
*/

package controller;

public class ContagemController {

	public ContagemController() {
		super();
	}
	
	public int contagem(int num, int alg) {
		int digito = num % 10;  //Recebe o �ltimo dig�to do n�mero
		int aux = num / 10;  //Recebe o n�mero sem o �ltimo dig�to (pr�ximo n�mero a ser usado)
		int soma;  //Recebe a contagem das compara��es verdadeiras
		
		if(aux == 0) {  //Condi��o de parada
			/*Quando o n�mero s� tem um dig�to a ser comparado*/
			if(digito == alg) {  //Se o dig�to for igual ao algarismo de compara��o, contar +1
				return 1;
			} else {
				return 0;
			}
		} else {
			if(digito == alg) {
				/*Caso o �ltimo dig�to do n�mero seja igual ao algarismo, o retorno � dado 
				 * pelo incremento de 1 mais a chamada da fun��o com o n�mero retirado o 
				 * seu �ltimo dig�to e com o algarismo para compara��o*/
				soma = 1 + contagem(aux, alg);
			} else {
				/*Caso o �ltimo dig�to do n�mero n�o seja igual ao algarismo, o retorno � 
				 * dado pela chamada da fun��o com o n�mero retirado o seu �ltimo dig�to 
				 * e com o algarismo para compara��o*/
				soma = contagem(aux, alg);
			}
		}
		
		return soma;
	}

}
