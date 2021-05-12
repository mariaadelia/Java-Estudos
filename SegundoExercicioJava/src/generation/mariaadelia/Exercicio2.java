package generation.mariaadelia;
/*Programa: Ler 10 números e mostrar quantos são pares e quantos são ímpares, usando o for
* Autora: Maria Adélia
* Data: 06/05/21
* */

import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero, pares = 0, impares = 0;
		
		for(int cont = 1; cont <= 10; cont++) {
			
			System.out.print("Digite o " + cont + "o. número: ");
			numero = ler.nextInt();
			
			if((numero % 2)== 0) {
				pares ++;
			}
			else {
				impares ++;
			}
		}
		
		System.out.println(pares + " são números pares.");
		System.out.println(impares + " são números ímpares.");
		
		ler.close();
	}
}
