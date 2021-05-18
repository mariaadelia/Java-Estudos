package exercicio5;

import java.util.Scanner;

public class TestePatinete {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Patinete p1 = new Patinete ();
		
		System.out.print("Cor do patinete: ");
		p1.setCorPatinete(entrada.next());
		System.out.print("Qunatida de rodas: ");
		p1.setQuantidadeRodas(entrada.nextInt());
		System.out.print("\"True\" para motorizado e \"False\" para não motorizado: ");
		p1.setEletronico(entrada.nextBoolean());
		
		System.out.println("\nCor do patinete: " + p1.getCorPatinete());
		System.out.println("Quantidade de rodas: " + p1.getQuantidadeRodas());
		System.out.println("Eletronico? " + p1.isEletronico());
		
		entrada.close();
		
	}

}
