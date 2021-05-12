package generation.mariaadelia;
/*Programa: Calcular o valor do carro novo após ler o custo de fábrica
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.*;
public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custoFabrica, porcDistribuidor, imposto, precoTotal;
		
		System.out.print("Digite o preço de fábrica do carro: R$ ");
		custoFabrica = ler.nextDouble();
		
		//porcDistribuidor = 28% do custo de fabrica
		porcDistribuidor = custoFabrica * 0.28;
		//imposto = 45% do (custo de fabrica + porcDistribuidor)
		imposto = (custoFabrica + porcDistribuidor) * 0.45;
		//preço total = a soma de todos
		precoTotal = custoFabrica + porcDistribuidor + imposto;
		
		System.out.printf("O preço do carro é de: R$ %.2f", precoTotal);
		
		ler.close();
	}

}
