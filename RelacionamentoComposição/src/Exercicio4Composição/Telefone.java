package Exercicio4Composi��o;

public class Telefone {

	private String ddd;
	private String numero;
	
	public Telefone( String ddd, String numero )	{
		
		this.ddd = ddd;
		this.numero = numero;
		
	}
	public String getTelefone()	{
		
		return ddd + numero;
	}
}