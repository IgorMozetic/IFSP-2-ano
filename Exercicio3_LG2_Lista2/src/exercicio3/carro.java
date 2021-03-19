package exercicio3;
public class carro {
		
	private String modelo; 
	private String marca; 
	private int ano;
		 
	private static int contador = 0;

	public void setCarro( String modelo, String marca, int ano )	{
	this.modelo = modelo; 
	this.marca = marca; 
	this.ano = ano;

	if ( ano  >  0)
	contador++;
	}

	public void setContador(int contador) {
	this.contador=contador;
	}

	public static int getCarros() {
	return contador;
	}
}
