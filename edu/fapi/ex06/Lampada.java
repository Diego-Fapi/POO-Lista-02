package br.edu.fapi.ex06;

import java.util.Scanner;

public class Lampada {
	Scanner ler = new Scanner(System.in);
	int voltagem;
	int potencia;
	String cor;
	int luminosidade;
	
	public void InserirDados(){
		System.out.println("Voltagem: ");
		voltagem = ler.nextInt();
		System.out.println("Potência: ");
		potencia = ler.nextInt();
		System.out.println("Cor: ");
		cor = ler.next();
		System.out.println("Luminosidade: ");
		luminosidade = ler.nextInt();
	}
	
	

}