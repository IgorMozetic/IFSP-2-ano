package Exerc�cio1e2;

public class Mobile {

	private String modelo;
	private String marca;
	private CartaoSIM cart�o;
	
	public Mobile()	{
		
		this.modelo = "";
		this.marca = "";
		this.cart�o = new CartaoSIM();
	}
	
	public Mobile( String modelo, String marca, CartaoSIM cart�o )	{
		
		this.modelo = modelo;
		this.marca = marca;
		this.cart�o = cart�o;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public CartaoSIM getCart�o() {
		return cart�o;
	}

	public void setCart�o(CartaoSIM cart�o) {
		this.cart�o = cart�o;
	}
}