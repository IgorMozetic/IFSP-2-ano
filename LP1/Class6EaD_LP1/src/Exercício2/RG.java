package Exerc�cio2;

public class RG {

	private String nome;
	private String dataemiss�o;
	private String n�mero;
	
	public RG()	{
		
		this.nome = "";
		this.dataemiss�o = "";
		this.n�mero = "";
	
	}
	
	public RG( String nome, String dataemiss�o, String n�mero )	{
		
		this.nome = nome;
		this.dataemiss�o = dataemiss�o;
		this.n�mero = n�mero;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataemiss�o() {
		return dataemiss�o;
	}

	public void setDataemiss�o(String dataemiss�o) {
		this.dataemiss�o = dataemiss�o;
	}

	public String getN�mero() {
		return n�mero;
	}

	public void setN�mero(String n�mero) {
		this.n�mero = n�mero;
	}
}
