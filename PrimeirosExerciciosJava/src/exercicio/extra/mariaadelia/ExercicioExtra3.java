package exercicio.extra.mariaadelia;
/*Programa: Ler a idade e definir a categoria
* Autora: Maria Adélia
* Data: 05/05/21
* */
import java.util.*;
public class ExercicioExtra3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria infantil!");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria juvenil!");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria adulto!");
		}
		else {
			System.out.println("Desculpe, não há categorias para você.");
		}
		
		ler.close();
	}

}
