package ListaDeExerc�cios6;

public class Livro {

	private String nome;
	private String autor;
	private String edi��o;
	
	public Livro()	{
		this.nome = "";
		this.autor = "";
		this.edi��o = "";
	}
	
	public Livro( String nome, String autor, String edi��o )	{
		this.nome = nome;
		this.autor = autor;
		this.edi��o = edi��o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdi��o() {
		return edi��o;
	}

	public void setEdi��o(String edi��o) {
		this.edi��o = edi��o;
	}
	
	public String toString()	{
		return "Livro: nome = " + nome + " Autor = " + autor + " Edi��o = " + edi��o;
	}
}
