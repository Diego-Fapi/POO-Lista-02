package Ex08;

import java.util.Scanner;

public class Empregado {
	Scanner ler = new Scanner(System.in);
	String nome;
	String sobrenome;
	int matricula;
	int horario_Entrada;
	int horario_Saida;
	int dias_trabalhados;
	
	public void inserirDados() {
		System.out.println("Digite o nome do funcion�rio:");
		nome = ler.nextLine();
		System.out.println("Digite o sobrenome do funcion�rio:");
		sobrenome = ler.nextLine();
		System.out.println("Digite o n�mero da matr�cula do funcion�rio:");
		matricula = ler.nextInt();
		System.out.println("Digite o hor�rio de entrada:");
		horario_Entrada = ler.nextInt();
		System.out.println("Digite o hor�rio de sa�da:");
		horario_Saida = ler.nextInt();
		System.out.println("Digite a quantidade de dias trabalhados::");
		dias_trabalhados = ler.nextInt();
		
	}
}
