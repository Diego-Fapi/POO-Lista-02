package br.edu.fapi.ex04;

public class Divisao {
	public static void executarDivisao(float n1,float n2) {
		
		if(n2 == 0) {
			System.out.println("Impossível dividir por zero");
		}else {
			float result;
			
			result = n1 / n2;
			
			System.out.println(result);
			
		}
		
	}
}
