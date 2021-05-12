package generation.mariaadelia;
/*Programa: Ler números inteiros e mostrar a média dos múltiplos de 3 (para sair é só digitar o 0). Usar do...while
* Autora: Maria Adélia
* Data: 06/05/21
* */

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double numero, multiplos3 = 0, quantMultiplos3 = 0;
		double mediaMultiplos3;
		
		do {
			System.out.print("Digite um número inteiro (ou \"0\" para sair): ");// \" para colocar aspas no texto
			numero = ler.nextDouble();
			
			if(numero % 3 == 0 && numero != 0) {//para saber se é múltiplo de 3 e para não contar o 0
				multiplos3 += numero;//somar todos os valores(para a média)
				quantMultiplos3++; //somar quantos números (para a média)
			}//else if
			
		}while(numero != 0);
		
		mediaMultiplos3 = multiplos3 / quantMultiplos3;
		
		System.out.println("A média dos múltiplos de 3 digitados é de: " + mediaMultiplos3);
		ler.close();
	}//main

}//class
