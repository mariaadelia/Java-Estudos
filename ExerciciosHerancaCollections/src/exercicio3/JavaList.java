package exercicio3;

import java.util.*;

public class JavaList{
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String p1;
		String p2;
		String p3;
		String p4;
		char remover;
		char add;
		int excluir;
		
		System.out.println("PRODUTO 1");
		System.out.print("Digite o nome do produto: ");
		p1 = entrada.nextLine();
		
		System.out.println("\nPRODUTO 2");
		System.out.print("Digite o nome do produto: ");
		p2= entrada.nextLine();
		
		System.out.println("\nPRODUTO 3");
		System.out.print("Digite o nome do produto: ");
		p3 =entrada.nextLine();
		
		System.out.println("\nPRODUTO 4");
		System.out.print("Digite o nome do produto: ");
		p4 = entrada.nextLine();
		
		ArrayList <String>produtos = new ArrayList<String>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		
		System.out.print("Deseja excluir algum dos produtos digitados [S]/[N]:");
		remover = entrada.next().charAt(0);
		
		if (remover == 'S') {
			System.out.print("Digite o número do produto que deseja exluir: ");
			excluir = entrada.nextInt();
			produtos.remove((excluir - 1));
			System.out.print("Deseja adicionar outro produto? [S]/[N]: ");
			add = entrada.next().charAt(0);
			
			if(add == 'S') {
				String p5;
				entrada.nextLine();
				System.out.println("\nPRODUTO 5");
				System.out.print("Digite o nome do produto: ");
				p5 = entrada.nextLine();
				produtos.add(p5);
				
				System.out.println("\n\nPRODUTOS CADASTRADOS");
				for(String a: produtos) { 
					
					System.out.println("Produto: " + a);
				}
				
			}
			else if(add == 'N') {
				System.out.println("\n\nPRODUTOS CADASTRADOS");
				for(int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.size());
				}
			}
			else {
				System.out.println("Opção inválida");
			}
			
		}
		else if (remover == 'N') {
			System.out.print("Deseja adicionar outro produto? [S]/[N]: ");
			add = entrada.next().charAt(0);
			if(add == 'S') {
				String p5;
				entrada.nextLine();
				System.out.println("\nPRODUTO 5");
				System.out.print("Digite o nome do produto: ");
				p5 = entrada.nextLine();
				produtos.add(p5);
				
				System.out.println("\n\nPRODUTOS CADASTRADOS");
				for(int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}
			}
			else if(add == 'N') {
				System.out.println("\n\nPRODUTOS CADASTRADOS");
				for(int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}
			}
			else {
				System.out.println("Opção inválida");
			}
			
		}
		else {
			System.out.println("Opção inválida");
		}
		
		entrada.close();
	}

}
