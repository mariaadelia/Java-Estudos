package exercicio2;

import java.util.Scanner;

public class TesteAviao {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		Aviao av = new Aviao();
		
		System.out.print("Digite a companhia aerea: ");
		av.setCompanhiaAerea(entrada.next());
		System.out.print("Digite o número de passageiros: ");
		av.setNumPassageiros(entrada.nextInt());
		System.out.print("Digite a velocidade máxima: ");
		av.setVelocidadeMaxima(entrada.nextDouble());
		System.out.print("Digite a aceleração: ");
		av.setAceleracao(entrada.nextInt());
		System.out.print("Digite \"True\" para se o avião está ligado ou \"False\" caso esteja desligado: ");
		av.setLigado(entrada.nextBoolean());	
		
		entrada.close();
	}

}
