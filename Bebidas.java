package Totem;

public class Bebidas extends Alimentos {

	private String tipo, sabor;
	private boolean gelo;
	private int Volume;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isGelo() {
		return gelo;
	}

	public void setGelo(boolean gelo) {
		this.gelo = gelo;
	}
	
	public int getVolume() {
		return Volume;
	}

	public void setVolume(int Volume) {
		this.Volume = Volume;
	}
}