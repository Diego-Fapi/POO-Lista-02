package ex12;

public class MostraResultado {
	
	
	public void mostrarValor(int qtdProduto) {
		Picles picles = new Picles();
		Tomate tomate = new Tomate();
		Hamburguer hamburguer = new Hamburguer();
		Queijo queijo = new Queijo();
		Maionese maionese = new Maionese();
		KetChup ketchup = new KetChup();
		Bacon bacon = new Bacon();

	
		
	double totall = picles.qtdPicles() + tomate.qtdTomate() + hamburguer.qtdHamburguer(qtdProduto) + queijo.qtdQueijo(qtdProduto) + maionese.qtdMaionese() + ketchup.qtdKetchup() + bacon.qtdBacon(qtdProduto);
	
	

	
	System.out.println("Picles:" + picles.qtdPicles());
	System.out.println("Tomate:" + tomate.qtdTomate());
	System.out.println("Hamburguer:" + hamburguer.qtdHamburguer(qtdProduto));
	System.out.println("Queijo:" + queijo.qtdQueijo(qtdProduto));
	System.out.println("Maionese:" + maionese.qtdMaionese());
	System.out.println("KetChup:" + ketchup.qtdKetchup());
	System.out.println("Bacon:" + bacon.qtdBacon(qtdProduto));
	System.out.println(totall);
	}
	
	
	
	
	
	
	
	
}
