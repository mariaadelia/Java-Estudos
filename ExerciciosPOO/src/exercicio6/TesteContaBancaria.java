package exercicio6;

import java.util.Scanner;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		ContaBancaria cb = new ContaBancaria();
		
		System.out.print("Digite o nome: ");
		cb.setNome(entrada.nextLine());
		System.out.print("Digite o CPF: ");
		cb.setCpf(entrada.next());
		System.out.print("Digite o endereço: ");
		cb.setEndereco(entrada.nextLine());
		entrada.nextLine();
		System.out.print("Digite o tipo de conta (Universitária, Pessoa física,"
				+ " MEI, empresário, etc): ");
		cb.setTipoConta(entrada.nextLine());
		
		System.out.println("\n\nNome: " + cb.getNome());
		System.out.println("CPF: " + cb.getCpf());
		System.out.println("Endereço: " + cb.getEndereco());
		System.out.println("Tipo de conta: " + cb.getTipoConta());
		
		entrada.close();
	}

}
