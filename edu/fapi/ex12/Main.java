package ex12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int qtdProduto = 0;
		int op;
		
		System.out.println("Seja bem-vindo!");
		System.out.println("Vamos montar o seu sanduiche?");
		
		System.out.println();
		System.out.println("O senhor deseja picles?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			Picles picles = new Picles();
			picles.qtdPicles();
			break;
		case 2:
			break;
		}
		
		
		System.out.println();
		System.out.println("O senhor deseja tomate?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			Tomate tomate = new Tomate();
			tomate.qtdTomate();
			break;
		case 2:
			break;
		}
			
		
		System.out.println();
		System.out.println("O senhor deseja hamburgueres? (Obs: 2 já inclusos)");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			System.out.println("Quantas unidades?");
			qtdProduto = ler.nextInt();
			Hamburguer hamburguer = new Hamburguer();
			hamburguer.qtdHamburguer(qtdProduto);
			break;
		case 2:
			break;
		}	
			
		
		System.out.println();
		System.out.println("O senhor deseja queijo?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			System.out.println("Quantas fatias?");
			qtdProduto = ler.nextInt();
			Queijo queijo = new Queijo();
			queijo.qtdQueijo(qtdProduto);
			break;
		case 2:
			break;
		}
		
		
		System.out.println();
		System.out.println("O senhor deseja maionese?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			Maionese maionese = new Maionese();
			maionese.qtdMaionese();
			break;
		case 2:
			break;
		}
		
		
		System.out.println();
		System.out.println("O senhor deseja KetChup?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			KetChup ketchup = new KetChup();
			ketchup.qtdKetchup();
			break;
		case 2:
			break;
		}
		
		
		System.out.println();
		System.out.println("O senhor deseja bacon?");
		System.out.println("1 - SIM   2 - NÃO");
		System.out.print("Opção: ");
		op = ler.nextInt();
		switch (op) {
		case 1:
			System.out.println("Quantas fatias?");
			qtdProduto = ler.nextInt();
			Bacon bacon = new Bacon();
			bacon.qtdBacon(qtdProduto);
			break;
		case 2:
			break;
		}
		
		
		Sanduiche sanduiche = new Sanduiche();
		sanduiche.montarSanduiche();
		
		
		
		
		
		
		
		
		MostraResultado valor = new MostraResultado();
		valor.mostrarValor(qtdProduto);
		
		
		
		
		
		
			
	}

}
