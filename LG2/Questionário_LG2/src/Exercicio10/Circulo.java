package Exercicio10;

public class Circulo {

	private static Double raio;
	
	public Double getraio() {
		return raio;
	}
	
	public void setraio( Double raio )	{
		this.raio = raio;
	}
	
	public static Double getArea() {
		return 3.14 * ( raio * raio );
	}
	
	public static Double getPerimetro() {
		return ( 2 * 3.14 ) * raio;
	}
}

