package br.edu.fapi.ex02;

import java.util.Scanner;

public class Produto {
	Scanner ler = new Scanner(System.in);
	
	String nome;
	String marca;
	float preco;
	int qtd;
	String cor;
	String fornecedor;
	
	
	public void inserirDados() {
		System.out.println("Nome do produto: ");
		nome = ler.next();
		System.out.println("Marca: ");
		marca = ler.next();
		System.out.println("Preço: ");
		preco = ler.nextFloat();
		System.out.println("Quantidade");
		qtd = ler.nextInt();
		System.out.println("Cor: ");
		cor = ler.next();
		System.out.println("Fornecedor: ");
		fornecedor = ler.next();
	}
	
	
	public void printaNome() {
		System.out.println("Nome: " + nome);
	}
	
	public void printaMarca() {
		System.out.println("Marca: " + marca);
	}
	
	public void printaPreco() {
		System.out.println("Preço: " + preco);
	}
	
	public void printaQuant() {
		System.out.println("Quantidade: ");
	}
	
	public void printaCor() {
		System.out.println("Cor: " + cor);
	}
	
	public void printaFornecedor() {
		System.out.println("Fornecedor: " + fornecedor);
	}
}
