package generation.mariaadelia;
/*Programa: /*Programa: Ler uma matriz 3x3 e mostrar quantos números são maiores que 10
 * Autora: Maria Adélia
 * Data: 07/05/21
 * */

import java.util.*;
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		double [][] matriz3x3 = new double [3][3];
		Scanner ler = new Scanner(System.in);
		int maior10 = 0;
		
		for(int l = 0; l < matriz3x3.length; l++) {//matriz3x3.length = mostra o tamanho da linha
			for(int c = 0; c < matriz3x3.length; c++) {
				System.out.print("Digite o valor da linha " + (l + 1) + " "
						+ "coluna " + (c + 1)+ " : ");
				matriz3x3[l][c] = ler.nextInt();
				
				if(matriz3x3[l][c] > 10) {
					maior10 += 1;
				}
			}
			System.out.println();
		}
		
		System.out.println(maior10 + " números são maiores que 10.");
	
		ler.close();
	}

}
