package generation.mariaadelia;
/*Programa: Ler idade, sexo e opções (calma, nervosa ou agressiva) de 150 pessoas e mostrar quants. pessoas são calmas,
 * 			quantas mulheres são nervosas, quantos homens são agressivos, quantos outros são calmos, quantas pessoas são
 * 			nervosas (com + de 40 anos) e quantas pessoas são calmas (com - de 18 anos)
* Autora: Maria Adélia
* Data: 06/05/21
* */

import java.util.*;
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade = 0, contador = 1, pCalmas = 0, mNervosas = 0, hAgressivos = 0, oCalmos = 0, pNervosasMais40 = 0, pCalmasMenos18 = 0;
		char sexo, opcoes;
		
		System.out.println("\tCaracterística Psicologicas da Região Oeste de São Paulo");
		System.out.println("------------------------------------------------------------------------");
		
		//while para contar os 150
		while(contador <= 150) {//trocar por 150 depois
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			if(idade <= 0) {//Para dar opção inválida caso digitem uma idade negativa
				System.out.println("Você digitou uma idade inválida\n");
			}//if
			
			System.out.println("Digite o sexo: ");
			System.out.println("\t[1]feminino");
			System.out.println("\t[2]masculino");
			System.out.println("\t[3]outros");
			sexo = ler.next().charAt(0);
			if(sexo != 1 && sexo != 2 && sexo != 3) {//Para dar opção inválida caso não digitem o número incorreto
				System.out.println("Você digitou uma opção inválida\n");
			}//if
			
			System.out.println("Digite a opção que mais combina com você: ");
			System.out.println("\t[1]uma pessoa calma");
			System.out.println("\t[2]uma pessoa nervosa");
			System.out.println("\t[3]uma pessoa agressiva");
			opcoes = ler.next().charAt(0);
		
			
			switch (opcoes) {
			
			case '1'://pessoas calmas, outros calmos e pessoas calmas com -18
				pCalmas = pCalmas + 1;//somar +1 para pessoas calmas 
				
				if(sexo == '3') {//para outros calmos
					oCalmos = oCalmos + 1;
				}//if
				if(idade < 18) {//para pessoas < 18 anos
					pCalmasMenos18 = pCalmasMenos18 + 1;
				}//if
				break;
				
			case '2':
				if(sexo == '1') {//para mulheres nervosas
					mNervosas  = mNervosas + 1;
				}//if
				if(idade > 40) {//pessoas nervosas > 40 anos
					pNervosasMais40 = pNervosasMais40 + 1;
				}//if
				break;
				
			case '3':
				if(sexo == '2') {//para homens agressivos
					hAgressivos = hAgressivos + 1;
				}//if
				break;
			default:
				System.out.println("Você digitou uma opção inválida");	
			}//switch
			
			contador ++;
			
		}//while
	
		System.out.println("\nHá " + pCalmas + " pessoas calmas.");
		System.out.println("Há " + mNervosas + " mulheres nervosas.");
		System.out.println("Há " + hAgressivos + " homens agressivos.");
		System.out.println("Há " + oCalmos + " outros calmos.");
		System.out.println("Há " + pNervosasMais40 + " pessoas nervosas com mais de 40 anos.");
		System.out.println("Há " + pCalmasMenos18 + " pessoas calmas com menos de 18 anos.");
	
	ler.close();
	}//main

}
