package Exercicio4Agrega��o;

public class Cliente {
	
	private String codigo;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endere�o endere�o;
	
	public void setCliente( String codigo, String nome, String cpf, Telefone telefone, Endere�o endere�o) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endere�o = endere�o;
	}
	public String getCliente()	{
		
	return "\n\nC�digo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone.getTelefone() + "\n***Endere�o*** " + endere�o.getEndere�o();
	}
}
