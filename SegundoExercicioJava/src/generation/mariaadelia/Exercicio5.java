package generation.mariaadelia;
/*Programa: Ler números digitados até ser == 0, e depois somá-los (usando o do...while)
* Autora: Maria Adélia
* Data: 06/05/21
* */

import java.util.*;
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double numero, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextDouble();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("A soma dos números é de: " + soma);
		
		ler.close();
		
	}//main

}//class
