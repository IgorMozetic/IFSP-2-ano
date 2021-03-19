package Exercicio4Composição;

public class Cliente {

	private String codigo;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endereço endereço;
	
	public Cliente( String codigo, String nome, String cpf, String ddd, String numero, String cep, String logradouro, String num, String complemento, String bairro, String cidade, String uf ) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = new Telefone( ddd, numero );
		this.endereço = new Endereço( cep, logradouro, num, complemento, bairro, cidade, uf );
	}
	public String getCliente()	{
		
	return "\nCódigo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone.getTelefone() + "\n***Endereço*** " + endereço.getEndereço();
	}
}
