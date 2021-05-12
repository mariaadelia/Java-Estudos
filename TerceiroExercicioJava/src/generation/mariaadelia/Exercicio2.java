package generation.mariaadelia;
/*Programa: Ler 6 números inteiros, mostrar os pares e somá-los. Mostrar os ímpares e quantos são
 * Autora: Maria Adélia
 * Data: 07/05/21
 * */

import java.util.Scanner;
import java.util.ArrayList; //pode usar o java.util.*; - que engloba todo mundo

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int[]numeros = new int[6];
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> pares = new ArrayList ();//funciona das duas formas
		ArrayList impares = new ArrayList ();
		
		int somaPares = 0, quantImpares = 0;
		
		for(int cont = 0; cont < numeros.length; cont++) {
			
			System.out.print("Digite o "+ (cont + 1)+"o. número: ");
			numeros[cont] = ler.nextInt();
			
			if(numeros[cont] % 2 == 0) {
				pares.add(numeros[cont]);
				somaPares += numeros[cont];
			}//if
			else {
				impares.add(numeros[cont]);
				quantImpares ++;
			}//else
		}//for
		
		System.out.println("Os números pares são: " + pares);
		System.out.println("A soma dos números pares é de: " + somaPares);
		System.out.println("Os números ímpares são: " + impares);
		System.out.println("A quantidade de números ímpares é de: " + quantImpares);
		
		ler.close();
		
	}//main

}
