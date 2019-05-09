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
		System.out.println("Digite o nome do funcionário:");
		nome = ler.nextLine();
		System.out.println("Digite o sobrenome do funcionário:");
		sobrenome = ler.nextLine();
		System.out.println("Digite o número da matrícula do funcionário:");
		matricula = ler.nextInt();
		System.out.println("Digite o horário de entrada:");
		horario_Entrada = ler.nextInt();
		System.out.println("Digite o horário de saída:");
		horario_Saida = ler.nextInt();
		System.out.println("Digite a quantidade de dias trabalhados::");
		dias_trabalhados = ler.nextInt();
		
	}
}
