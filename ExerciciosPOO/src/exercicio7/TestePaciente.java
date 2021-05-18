package exercicio7;

import java.util.Scanner;
public class TestePaciente {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Paciente pc = new Paciente();
		
		System.out.print("Digite o nome: ");
		pc.setNome(entrada.nextLine());
		System.out.print("Digite a idade: ");
		pc.setIdade(entrada.nextInt());
		System.out.print("Digite o CPF: ");
		pc.setCpf(entrada.next());
		entrada.nextLine();
		System.out.print("Digite o endereço: ");
		pc.setEndereco(entrada.nextLine());
		System.out.print("Digite o hospital em que foi realizado o atendimento: ");
		pc.setHospitalAtendido(entrada.nextLine());
		
		
		System.out.println("\n\nNome: " + pc.getNome());
		System.out.println("Idade: " + pc.getIdade());
		System.out.println("CPF: " + pc.getCpf());
		System.out.println("Endereço: " + pc.getEndereco());
		System.out.println("Hospital que fez o atendimento: " + pc.getHospitalAtendido());
		
		entrada.close();
	}

}
