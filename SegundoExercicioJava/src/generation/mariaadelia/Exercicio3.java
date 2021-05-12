package generation.mariaadelia;
/*Programa: Ler idades (o programa para quando -99 for digitado) e mostras quantos são < 21 anos e quantos são > 50.
 * 			Usando o while.
* Autora: Maria Adélia
* Data: 06/05/21
* */
import java.util.*;
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade, menor21 = 0, maior50 = 0;
		
		System.out.print("Digite a idade (ou -99 para sair): ");
		idade = ler.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				if(idade != 0) {//Pois não há idade = a 0
					menor21 += 1;
				}//if
				else {
					System.out.println("Idade inválida e desconsiderada");
				}//else
			}//if
			
			if(idade > 50) {
				maior50 += 1;
			}//if
			
			System.out.print("\nDigite a idade (ou -99 para sair): ");
			idade = ler.nextInt();
			
		}//while
		
		System.out.println("\n" + menor21 + " pessoas tem menos que 21 anos e " + maior50 + " pessoas"
				+ " tem mais de 50 anos.");
		
		ler.close();
	
	}//main

}
