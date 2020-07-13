package exercicio3;

public class Produtos {
	
	private String nomeProduto;
	private String descricaoProduto;
	private double precoProduto;
	private boolean statusProduto;
	
	public Produtos(String nomeProduto, String descricaoProduto, double precoProduto, boolean statusProduto) {
		
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
		this.statusProduto = statusProduto;
		
	}
	
	public String ligarProduto() {
		statusProduto = true;
		String status = "O produto foi ligado";
		return status;
	}
	public String desligarProduto() {
		statusProduto = false;
		String status = "O produto foi desligado";
		return status;
	}
	
	public String mostrarDados() {
		String status;
		if (statusProduto == false) {
			status = "Produto esta desligado";
		}else {
			status = "Produto esta ligado";
		}
		String informacoes = nomeProduto + " " + descricaoProduto + " " + precoProduto + " " + status;
		return informacoes;
	}

}
