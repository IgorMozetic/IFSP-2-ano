package Exercicio10;

public class TesteCalcular {
	
	public static void main(String[] args) {
	
		Circulo c1 = new Circulo();
		
		c1.setraio( 2.0 );
		c1.getraio();
		System.out.println("O valor do raio �: " + c1.getraio());
		System.out.println("O valor do �rea �: " +c1.getArea());
		System.out.println("O valor do per�metro �: " +c1.getPerimetro());
	}
}
