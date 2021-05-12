package generation.mariaadelia;
/*Programa: /*Programa: Ler duas matrizes 2x2 e mostrar um menu com as opções: [1] somar 
 * as duas matrizes; [2] subtrair as duas matrizes; [3] adicionar uma constante escolhida
 * pelo usuário às matrizes; [4] imprimir as matrizes
 */

import java.util.*;
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double [][] matriz1 = new double [2][2];
		double [][] matriz2 = new double [2][2];
		double [][] matrizSoma = new double [2][2];
		double [][] matrizSub = new double [2][2];
		int opcao;
		double constante;
		
		//Ler o valor das matrizes
		System.out.println("\tPRIMEIRA MATRIZ");
		for(int l = 0; l < matriz1.length; l++){
			for(int c = 0; c < matriz1.length; c++) {
				System.out.print("Digite o valor da linha " + (l + 1) + " coluna"
						+ " " + (c+1) + " : ");
				matriz1[l][c] = ler.nextDouble();
			}
		}
		
		System.out.println("\n\tSEGUNDA MATRIZ");
		for(int l = 0; l < matriz2.length; l++){
			for(int c = 0; c < matriz2.length; c++) {
				System.out.print("Digite o valor da linha " + (l + 1) + " coluna"
						+ " " + (c+1) + " : ");
				matriz2[l][c] = ler.nextDouble();
			}
		}
		
		//Mostrar e ler as opções desejadas
		System.out.println("\n----------------------------------");
		System.out.println("Digite a opção desejadas: ");
		System.out.println("[1] somar as duas matrizes ");
		System.out.println("[2] subtrair as duas matrizes ");
		System.out.println("[3] adicionar uma constante às matrizes ");
		System.out.println("[4] imprimir as matrizes ");
		opcao = ler.nextInt(); 
		
		//switch...case
		switch (opcao) {
		case 1://soma
			
			System.out.println("\nA nova matriz é igual a: ");
			for(int l = 0; l < matrizSoma.length; l++) {
				for(int c = 0; c < matrizSoma.length; c++) {
					matrizSoma [l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.print("| " + matrizSoma[l][c] + " | ");
				}
				
				System.out.println();
			}
			
			break;
			
		case 2://subtração
			
			System.out.println("\nA nova matriz é igual a: ");
			for(int l = 0; l < matrizSub.length; l++) {
				for(int c = 0; c < matrizSub.length; c++) {
					matrizSub [l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.print("| " + matrizSub[l][c] + " | ");
				}
				System.out.println();
			}
			
			break;
			
		case 3://+ constante
			
			System.out.println("\nDigite a constante desejada: ");
			constante = ler.nextDouble();
			
			//Primeira matriz
			System.out.println("\tPRIMEIRA MATRIZ");
			for(int l = 0; l < matriz1.length; l++){
				for(int c = 0; c < matriz1.length; c++) {
					matriz1[l][c] = matriz1[l][c] + constante;
					System.out.print("| " + matriz1[l][c]+ " | ");
				}
				
				System.out.println();
			}
			
			//Segunda matriz
			System.out.println("\n\tSEGUNDA MATRIZ");
			for(int l = 0; l < matriz2.length; l++){
				for(int c = 0; c < matriz2.length; c++) {
					matriz2[l][c] = matriz2[l][c] + constante;
					System.out.print("| " + matriz2[l][c] + " | ");
				}
				
				System.out.println();
			}
			
			break;
			
		case 4://Imprimir as matrizes
			
			//Primeira matriz
			System.out.println("\tPRIMEIRA MATRIZ");
			for(int l = 0; l < matriz1.length; l++){
				for(int c = 0; c < matriz1.length; c++) {
					System.out.print("| " + matriz1[l][c]+ " | ");
				}
				
				System.out.println();
			}
			
			//Segunda matriz
			System.out.println("\n\tSEGUNDA MATRIZ");
			for(int l = 0; l < matriz2.length; l++){
				for(int c = 0; c < matriz2.length; c++) {
					System.out.print("| " + matriz2[l][c] + " | ");
				}
				
				System.out.println();
			}
			
			break;
			
		default:
			
			System.out.println("Opção inválida");
			
			break;
			
		}//switch
		
		ler.close();
	}

}
