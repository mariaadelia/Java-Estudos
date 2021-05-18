package exercicio4;

import java.util.Scanner;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		System.out.print("Digite o nome do primeiro funciário: ");
		f1.setNomeFuncionario(entrada.nextLine());
		System.out.print("Digite o número do primeiro funciário: ");
		f1.setNumeroFuncionario(entrada.next());
		System.out.print("Digite a idade do primeiro funciário: ");
		f1.setIdadeFuncionario(entrada.nextInt());
		System.out.print("Digite há quanto tempo o funciário trabalha na empresa: ");
		f1.setTempoTrabalhado(entrada.nextInt());
		
		entrada.nextLine();
		System.out.print("\nDigite o nome do segundo funciário: ");
		f2.setNomeFuncionario(entrada.nextLine());
		System.out.print("Digite o número do segundo funciário: ");
		f2.setNumeroFuncionario(entrada.next());
		System.out.print("Digite a idade do segundo funciário: ");
		f2.setIdadeFuncionario(entrada.nextInt());
		System.out.print("Digite há quanto tempo o funciário trabalha na empresa: ");
		f2.setTempoTrabalhado(entrada.nextInt());
		
		System.out.println("\nFUNCINÁRIO 1");
		System.out.println("Nome do funcionário: " + f1.getNomeFuncionario());
		System.out.println("Número do funcionário: " + f1.getNumeroFuncionario());
		System.out.println("Idade do funcionário: " + f1.getIdadeFuncionario() + " anos");
		System.out.println("Tempo trabalhado: " + f1.getTempoTrabalhado() + " anos");
		
		System.out.println("\nFUNCINÁRIO 2");
		System.out.println("Nome do funcionário: " + f2.getNomeFuncionario());
		System.out.println("Número do funcionário: " + f2.getNumeroFuncionario());
		System.out.println("Idade do funcionário: " + f2.getIdadeFuncionario() + " anos");
		System.out.println("Tempo trabalhado: " + f2.getTempoTrabalhado() + " anos");
		
		entrada.close();
		
	}

}
