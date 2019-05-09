package br.edu.fapi.ex02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		
		produto.inserirDados();
		
		
		produto.printaNome();
		produto.printaMarca();
		produto.printaPreco();
		produto.printaQuant();
		produto.printaCor();
		produto.printaFornecedor();
	}

}
