package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		Produtos produtos = new Produtos("TV", "SMART", 1999.99, false);
		
		System.out.println(produtos.mostrarDados());
		System.out.println(produtos.ligarProduto());

	}

}
