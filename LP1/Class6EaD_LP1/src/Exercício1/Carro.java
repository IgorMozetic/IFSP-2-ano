package Exerc�cio1;

public class Carro {

	private String marca;
	private String modelo;
	private Integer anodefabrica��o;
	
	public Carro()	{
		
		this.marca = "";
		this.modelo = "";
		this.anodefabrica��o = 0;
	}
	
	public Carro( String marca, String modelo, Integer anodefabrica��o )	{
		
		this.marca = marca;
		this.modelo = modelo;
		this.anodefabrica��o = anodefabrica��o;
	}
	
	public String getMarca()	{
		return marca;
	}
	
	public void setMarca( String marca )	{
		this.marca = marca;
	}
	
	public String getModelo()	{
		return modelo;
	}
	
	public void setModelo( String modelo )	{
		this.modelo = modelo;
	}
	
	public Integer getAnodefabrica��o()	{
		return anodefabrica��o;
	}
	
	public void setAnodefabrica��o( Integer anodefabrica��o )	{
		this.anodefabrica��o = anodefabrica��o;
	}
}