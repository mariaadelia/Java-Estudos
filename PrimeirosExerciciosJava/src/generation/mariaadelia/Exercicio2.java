package generation.mariaadelia;
/*Programa: ler a idade em dias e mostrar em anos, meses e dias
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.*;
public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int dias;
		double diasEmAnos, diasEmMeses, diasTotais;
		
		System.out.print("Digite sua idade em dias: ");
		dias = ler.nextInt();
		System.out.println("---------------------------------");
		
		diasEmAnos = dias / 365;
		diasEmMeses = (dias % 365) / 30; //O resto, em dias, do ano  dividido por 30 (que é a quantidade de dias do mês)
		diasTotais = ((dias%365)%30); //O resto da divisão em meses, será a quantidade de dias
		
		System.out.println("Sua idade em anos é de: " + diasEmAnos + " anos");
		System.out.println("Sua idade em meses é de: " + diasEmMeses + " meses");
		System.out.println("Sua idade em dias é de: " + diasTotais + " dias");
		
		ler.close();
	}
}
