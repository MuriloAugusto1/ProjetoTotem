package Totem;

public class lanches extends Alimentos {

	private String carne;
	private boolean salada, acompanhamento, Molho;
	private int peso;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public boolean isMolho() {
		return Molho;
	}

	public void setMolho(boolean Molho) {
		this.Molho = Molho;
	}

	public boolean isSalada() {
		return salada;
	}

	public void setSalada(boolean salada) {
		this.salada = salada;
	}

	public boolean isAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(boolean acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	
}