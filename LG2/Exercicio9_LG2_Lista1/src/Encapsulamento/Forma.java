package Encapsulamento;

public class Forma {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		
		r1.getBase();
		r1.setBase(5.0);
		r1.getAltura();
		r1.setAltura(15.0);
		
		System.out.println( "A área do retângulo é de: " + r1.calcularArea() );
		System.out.println( "O perimetro do retângulo é de: " + r1.calcularPerimetro() );
	}

}
