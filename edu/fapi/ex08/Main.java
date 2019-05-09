package Ex08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Empregado empregado = new Empregado();
		CalculoSalario salario = new CalculoSalario();
		
		empregado.inserirDados();
		salario.calcularSalario(empregado);
		
		
		
		
		
	}

}
