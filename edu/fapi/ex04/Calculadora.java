package br.edu.fapi.ex04;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int op;
		float n1,n2;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		
		
		
		
		
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("Op��o: ");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			Soma soma = new Soma();
			soma.executarSoma(n1, n2);
			break;
		case 2:
			Subtra�ao subtracao = new Subtra�ao();
			subtracao.executarSubtracao(n1, n2);
			break;
		case 3:
			Multiplicacao multiplicacao = new Multiplicacao();
			multiplicacao.executarMultiplicacao(n1, n2);
			break;
		case 4:
			Divisao divisao = new Divisao();
			divisao.executarDivisao(n1, n2);
			break;
		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
		
		
		
		
	}

	

}
