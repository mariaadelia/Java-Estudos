package generation.mariaadelia;
/*Programa: ler 3 números e calcular d = (r = (a+b)^2) + (s = (b+c)^2) / 2
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double r, s, d;
		
		System.out.print("Digite o primeiro número: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		b = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = ler.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b+c), 2);
		d = (r + s) / 2;
		
		System.out.println("O resultado de " + a + " + " + b + " elevado a 2 mais"
				+ " " + b + " + " + c + " elevado a 2 dividido por 2 é de: " + d );
	
		ler.close();
	}

}
