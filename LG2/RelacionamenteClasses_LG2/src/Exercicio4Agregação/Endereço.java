package Exercicio4Agrega��o;

public class Endere�o {

	private String cep, logradouro, numero, complemento, bairro, cidade, uf;
	
	public void setEndere�o( String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String uf)	{	

		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	public String getEndere�o()	{
		
		return "\nCEP: " + cep + "\nLogradouro: " + logradouro + "\nNumero: " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nUF: " + uf;
	}
}