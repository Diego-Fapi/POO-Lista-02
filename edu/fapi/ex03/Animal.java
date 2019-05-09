package br.edu.fapi.ex03;

import java.util.Scanner;

public class Animal {
	Scanner ler = new Scanner(System.in);
	
	String nome;
	String especie;
	String cor;
	String porte;
	String peso;
	String apelido;
	
	public void inserirDados(){
		System.out.println("Nome do animal: ");
		nome = ler.next();
		System.out.println("Nome da espécie: ");
		especie = ler.next();
		System.out.println("Cor do animal: ");
		cor = ler.next();
		System.out.println("Porte do animal: ");
		porte = ler.next();
		System.out.println("Peso do animal: ");
		peso = ler.next();
		System.out.println("Apelido do animal: ");
		apelido = ler.next();
	}
	
	
	public void printaNome() {
		System.out.println("Nome: " + nome);
	}
	
	public void printaEspecie() {
		System.out.println("Espécie: " + especie);
	}
	
	public void printaCor() {
		System.out.println("Cor: " + cor);
	}
	
	public void printaPorte() {
		System.out.println("Porte: " + porte);
	}
	
	public void printaPeso() {
		System.out.println("Peso: " + peso);
	}
	
	public void printaApelido() {
		System.out.println("Apelido: " + apelido);
	}
}
