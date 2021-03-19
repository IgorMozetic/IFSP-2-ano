package Exercicio4Composi��o;

public class Cliente {

	private String codigo;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endere�o endere�o;
	
	public Cliente( String codigo, String nome, String cpf, String ddd, String numero, String cep, String logradouro, String num, String complemento, String bairro, String cidade, String uf ) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = new Telefone( ddd, numero );
		this.endere�o = new Endere�o( cep, logradouro, num, complemento, bairro, cidade, uf );
	}
	public String getCliente()	{
		
	return "\nC�digo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone.getTelefone() + "\n***Endere�o*** " + endere�o.getEndere�o();
	}
}
