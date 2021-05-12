package exercicio.extra.mariaadelia;
/*Programa: Ler um número e falar se é par ou ímpar. Se par, mostrar sua raiz,
 * se ímpar, mostrar o número ao quadrado
* Autora: Maria Adélia
* Data: 05/05/21
* */
import java.util.*;
public class ExercicioExtra4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		if((numero % 2) == 0) {//para saber se é par
			System.out.printf(numero +" é par e sua raiz é "
					+ "de %.3f", Math.sqrt(numero));
		}
		else {
			System.out.println(numero +" é ímpar e seu quadrado "
					+ "é de " + Math.pow(numero,2));
		}
		
		ler.close();
		
	}

}
