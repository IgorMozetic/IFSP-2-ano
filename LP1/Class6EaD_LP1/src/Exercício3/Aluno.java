package Exerc�cio3;

public class Aluno {

	private String nome;
	private String rg;
	private String prontu�rio;
	
	public Aluno()	{
		
		this.nome = "";
		this.rg = "";
		this.prontu�rio = "";
	}

	public Aluno( String nome, String rg, String prontu�rio )	{
		
		this.nome = nome;
		this.rg = rg;
		this.prontu�rio = prontu�rio;
	}

	public String getNome()	{
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getProntu�rio() {
		return prontu�rio;
	}

	public void setProntu�rio(String prontu�rio) {
		this.prontu�rio = prontu�rio;
	}
	
	
}
