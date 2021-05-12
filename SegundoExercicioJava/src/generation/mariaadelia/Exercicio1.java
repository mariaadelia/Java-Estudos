package generation.mariaadelia;
/*Programa: Entre 1000 e 1999, mostrar quais números que divididos por 11 tem resto igual a 5, usando o for
* Autora: Maria Adélia
* Data: 06/05/21
* */

public class Exercicio1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Esse são os números entre 1000 e 1999 que quando divididos por 11 tem resto 5:");
		
		for(int cont = 1000; cont <= 1999; cont++) {
			
			if ((cont % 11) == 5) {
				System.out.println(cont + " ");
				Thread.sleep(100);
			}
		}
	}

}
