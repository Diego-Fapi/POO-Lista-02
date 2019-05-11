package ex12;

public class Bacon {
	double valor = 1.00;
	double total;
		
	public double qtdBacon(int qtdProduto) {
		total = qtdProduto * valor;
		
		return total;
	}
}
