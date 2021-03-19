package Exercicio4Agregação;

public class Cliente {
	
	private String codigo;
	private String nome;
	private String cpf;
	private Telefone telefone;
	private Endereço endereço;
	
	public void setCliente( String codigo, String nome, String cpf, Telefone telefone, Endereço endereço) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereço = endereço;
	}
	public String getCliente()	{
		
	return "\n\nCódigo: " + codigo + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone.getTelefone() + "\n***Endereço*** " + endereço.getEndereço();
	}
}
