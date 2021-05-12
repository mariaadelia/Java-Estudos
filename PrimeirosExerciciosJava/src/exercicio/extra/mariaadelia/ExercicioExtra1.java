package exercicio.extra.mariaadelia;
/*Programa: Ler tries numeros inteiros e dizer qual é maior
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.*;
public class ExercicioExtra1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maiorNumero = 0;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
			System.out.println("O maior número é " + maiorNumero);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			maiorNumero = numero2;
			System.out.println("O maior número é " + maiorNumero);
		}
		else {
			maiorNumero = numero3;
			System.out.println("O maior número é " + maiorNumero);
		}
		
		ler.close();
	}

}
