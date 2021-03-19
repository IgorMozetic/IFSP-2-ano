package Exercicio10;

public class TesteCalcular {
	
	public static void main(String[] args) {
	
		Circulo c1 = new Circulo();
		
		c1.setraio( 2.0 );
		c1.getraio();
		System.out.println("O valor do raio é: " + c1.getraio());
		System.out.println("O valor do área é: " +c1.getArea());
		System.out.println("O valor do perímetro é: " +c1.getPerimetro());
	}
}
