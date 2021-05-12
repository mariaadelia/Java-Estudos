package generation.mariaadelia;
/*Programa: Um vetor de 6 números inteiros, fazer e mostrar a soma das posições 0, 1 e 5. Mudar o vetor
 * de posição 4 para 100 e mostrar os valores dos vetores um em cada linha
 * Autora: Maria Adélia
 * Data: 07/05/21
 * */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int [] vetorA = new int [6];
		
		vetorA [0] = 1;
		vetorA [1] = 0;
		vetorA [2] = 5;
		vetorA [3] = -2;
		vetorA [4] = -5;
		vetorA [5] = 7;
		
		int soma;
		soma = vetorA [0] + vetorA [1] + vetorA [5];
		System.out.println("A soma dos vetores 0, 1 e 5 é igual a: " + soma);
		//0,1 e 5 ou 1, 2 e 6(não contando o 0?)
		
		//Mudando o valor do Vetor 4
		vetorA[4] = 100;
		
		System.out.println();//Para pular linha
		
		//Imprimindo os valores dos vetores
		for(int cont = 0; cont < vetorA.length; cont++) {
			System.out.println("Vetor " + (cont + 1) + ": " + vetorA[cont]);
		}//for
				
		
	}//main

}//class
