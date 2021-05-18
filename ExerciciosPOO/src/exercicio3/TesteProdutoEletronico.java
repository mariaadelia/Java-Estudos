package exercicio3;

import java.util.Scanner;

public class TesteProdutoEletronico {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ProdutoEletronico pe = new ProdutoEletronico();
		
		System.out.print("Digite o tipo do produto: ");
		pe.setTipoProduto(entrada.next());
		System.out.print("Digite a marca do produto: ");
		pe.setMarca(entrada.next());
		System.out.print("Digite o ano de fabricação: ");
		pe.setAnoDaFabricacao(entrada.nextInt());
		System.out.print("Digite \"True\" se o aparelho funciona ou \"False\""
				+ "se o aparelho não funcionar  ");
		pe.setFunciona(entrada.nextBoolean());
		
		System.out.print("\n\n Tipo do Produto: " + pe.getTipoProduto());
		System.out.print("\n\n Marca do Produto: " + pe.getMarca());
		System.out.print("\n\n Ano da Fabricação: " + pe.getAnoDaFabricacao());
		System.out.print("\n\n Funciona? " + pe.isFunciona());
		entrada.close();
	}

}
