package br.edu.fapi.ex10;

public class Quadrado {
	public float informarArea(float l) {
		float result;
		
		result = l * l;
		
		System.out.println("A �rea do quadrado �: "+result);
		
		return result;
	}
	
	
	public float informarPerimetro(float l) {
		float result;
		
		result = l * 4;
		
		System.out.println("O per�metro do quadrado �: "+result);
		
		return result;
	}
	

}