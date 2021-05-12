package generation.mariaadelia;
/*Programa: mostrar a distancia entre 2 coordenadas
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.*;
public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double x1, y1, x2, y2, d;
		
		System.out.print("Digite o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println();
		System.out.print("Digite o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = ler.nextDouble();
		
		//Como fazer raiz Math.sqrt(número da raiz);
		d = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2 - y1), 2)));
		
		System.out.printf("A distância entre esses números é de: %.3f", d);
	
		ler.close();
	}

}
