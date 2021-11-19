package Totem;

public abstract class Alimentos {

	private int quantidade, valor_energetico;
	private double preco;
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getValor_energetico() {
		return valor_energetico;
	}

	public void setValor_energetico(int valor_energetico) {
		this.valor_energetico = valor_energetico;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}