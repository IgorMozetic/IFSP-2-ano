package Exercicio4Composição;

public class Endereço {

	private String cep, logradouro, num, complemento, bairro, cidade, uf;
	
		public Endereço( String cep, String logradouro, String num, String complemento, String bairro, String cidade, String uf)	{	

			this.cep = cep;
			this.logradouro = logradouro;
			this.num = num;
			this.complemento = complemento;
			this.bairro = bairro;
			this.cidade = cidade;
			this.uf = uf;
		}
		public String getEndereço()	{
		
			return "\nCEP: " + cep + "\nLogradouro: " + logradouro + "\nNumero: " + num + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nUF: " + uf;
		}
	}