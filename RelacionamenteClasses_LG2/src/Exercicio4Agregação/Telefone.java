package Exercicio4Agrega��o;

public class Telefone {

	private String ddd;
	private String numero;
	
	public void setTelefone( String ddd, String numero )	{
		
		this.ddd = ddd;
		this.numero = numero;
		
	}
	public String getTelefone()	{
		
		return ddd + numero;
	}
}