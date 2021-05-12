package generation.mariaadelia;
/*Programa: ler a idade em anos, meses e dias (ex: 18 anos, 3 meses e 2 dias) e transformar +
 * em dias
 * Autora: Maria Adélia
 * Data: 05/05/21
 * */

import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias;
		double anosDias, anosBissextos, mesesDias, diasTotais;
		
		System.out.print("Digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.print("Digite sua idade em meses: ");
		meses = ler.nextInt();
		System.out.print("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		anosDias = anos * 365;//Anos em dias (1 ano = 365 dias)
		anosBissextos = anos / 4; //Anos bissextos (são de 4 em 4 anos então divide)
		mesesDias = meses * 30;//Meses em dias (1 mês = 30 dias)
		diasTotais = anosDias + anosBissextos + mesesDias + dias;//Total de dias
				
		System.out.println("----------------------------------------------");
		System.out.println("Sua idade em dias é de: " + diasTotais);
		ler.close();
	}

}
