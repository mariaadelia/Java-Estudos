package generation.mariaadelia;

/*Programa: calcular x = (ce-bf)/(ae - bd); e y = (af-cd)/(ae - bd)
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */
import java.util.*;
public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o valor de a: ");
		a = ler.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = ler.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = ler.nextDouble();
		System.out.print("Digite o valor de d: ");
		d = ler.nextDouble();
		System.out.print("Digite o valor de e: ");
		e = ler.nextDouble();
		System.out.print("Digite o valor de f: ");
		f = ler.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.printf("x vale %.3f e y vale %.3f", x, y);
		
		ler.close();
	}

}
