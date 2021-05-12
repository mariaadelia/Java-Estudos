package generation.mariaadelia;
/*Programa: ler a duração do evento em segundos e mostrar em horas, minutos e segundos
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */
import java.util.*;
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int segundos;
		double totalHoras, totalMinutos, totalSegundos;
		
		System.out.println("\t\tDuração da Festa");
		System.out.println("-------------------------------------------------");
		System.out.print("Digite a duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		totalHoras = segundos / 3600; //1h tem 3600 segundos
		totalMinutos = (segundos % 3600)/60; //O resto da divisão de h (que será dado em seg), por 60 s (total de segundos em 1 minuto)
		totalSegundos = (segundos % 3600) % 60; //O resto da divisão em minutos será o total de segundos
		
		System.out.println("-------------------------------------------------");
		System.out.println("O evento durará " + totalHoras + " horas, " + totalMinutos + ""
				+ " minutos e " + totalSegundos + " segundos");
		
		ler.close();
	}

}
