package generation.mariaadelia;
/*Programa: ler a duração do evento em segundos e mostrar em horas, minutos e segundos
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.*;
public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("\tMÉDIA");
		System.out.println("--------------------------");
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		
		//nota1 é peso 2, nota2 é peso 3 e nota3 é peso 5
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("--------------------------");
		System.out.println("Sua média final é de: " + media);
	
		ler.close();
	}

}
