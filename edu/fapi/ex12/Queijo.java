package ex12;

public class Queijo {
	double valor = 1.00;
	double total;
		
	public double qtdQueijo(int qtdProduto) {
		total = qtdProduto * valor;
		
		return total;
	}
}
