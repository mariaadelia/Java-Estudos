package generation.mariaadelia;


import java.util.*;
public class Exercicio2MaisFacil {
	
	public static void main(String[] args) {
			
			int[]numeros = new int[6];
			Scanner ler = new Scanner (System.in);
			int somaPares = 0, quantImpares = 0;
			
			
			
			//Soma par e quantos ímpares
			for(int cont = 0; cont < numeros.length; cont++) {
				System.out.print("Digite o "+ (cont + 1)+"o. número: ");
				numeros[cont] = ler.nextInt();
				
				if(numeros[cont] % 2 == 0) {
					somaPares += numeros[cont];
				}//if
				else {
					quantImpares ++;
				}//else
			}//for
			System.out.println("A soma dos números pares é de: " + somaPares);
			System.out.println("A quantidade de números ímpares é de: " + quantImpares);
			
			
			
			//Números pares e ímpares
			System.out.println("Os números pares são: ");
			for(int l = 0; l < numeros.length; l++) {
				if(numeros[l] % 2 == 0) {
					System.out.print("[" + numeros[l] + "]");
		
				}
			}
			
			System.out.println("\nOs números ímpares são: ");
			for(int l = 0; l < numeros.length; l++) {
				if(numeros[l] % 2 != 0) {
					System.out.print("[" + numeros[l] + "]");
				}
			}
			ler.close();
			
		}//main

}
