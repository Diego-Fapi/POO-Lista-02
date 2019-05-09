package br.edu.fapi.ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		float l;
		int op;
		
		System.out.println("Quanto vale o seu L? ");
		l = ler.nextFloat();
		
		
		System.out.println("O que você gostaria de saber?");
		System.out.println("1 - Área do quadrado");
		System.out.println("2 - Perímetro do quadrado");
		System.out.print("Opção: ");
		op = ler.nextInt();
		
		
		switch(op) {
		case 1:
			quadrado.informarArea(l);
			break;
		case 2:
			quadrado.informarPerimetro(l);
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		
		
	}

}
