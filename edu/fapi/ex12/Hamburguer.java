package ex12;

public class Hamburguer {
	double valor = 2.00;
	double total;
		
	public double qtdHamburguer(int qtdProduto) {
		total = (valor * 2) + (qtdProduto * valor);
		
		return total;
	}
}
