package exercicio.extra.mariaadelia;
/*Programa: Ler tres numeros e colocar em ordem crescente
* Autora: Maria Adélia
* Data: 05/05/21
* */

import java.util.*;
public class ExercicioExtra2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite 3 números: ");
		n1 =ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente desses números são: " + n1 + ", "
					+ "" + n2 + " e " + n3);	
		}
		else if (n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente desses números são: " + n1 + ", "
					+ "" + n3 + " e " + n3);
		}
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente desses números são: " + n2 + ", "
					+ "" + n1 + " e " + n3);
		}
		else if (n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente desses números são: " + n2 + ", "
					+ "" + n3 + " e " + n1);
		}
		else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente desses números são: " + n3 + ", "
					+ "" + n1 + " e " + n2);
		}
		else {
			System.out.println("A ordem crescente desses números são: " + n3 + ", "
					+ "" + n2 + " e " + n1);
		}
		
		ler.close();
	}

}
