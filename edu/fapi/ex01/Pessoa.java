package br.edu.fapi.ex01;

import java.util.Scanner;

public class Pessoa {
	Scanner ler = new Scanner(System.in);	
	String nome;
	int idade;
	int rg;
	int cpf;
	
	
	
	public void inserirDados() {
		System.out.println("Digite o seu nome: ");
		nome = ler.next();
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		System.out.println("Digite o seu RG: ");
		rg = ler.nextInt();
		System.out.println("Digite o seu CPF: ");
		cpf = ler.nextInt();
	}
	
	
	
	
	public void printarNome() {
		System.out.println("Nome informado: " + nome);
	}
	
	public void printarIdade() {
		System.out.println("Idade informada: " + idade);
	}
	
	public void printarRg() {
		System.out.println("RG informado: " + rg);
	}
	
	public void printarCpf() {
		System.out.println("CPF informado: " + cpf);
	}
	
}
