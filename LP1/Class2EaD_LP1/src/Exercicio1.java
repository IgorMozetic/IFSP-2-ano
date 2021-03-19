public class Exercicio1 {

	public static void main(String[] args) {
		
		Integer numero = new Integer(150);
		System.out.println("Os números de 150 até 300 são: ");
		while ( numero < 301 ) {
			
			System.out.print( numero + ", " );
			
			numero = numero + 1;
		}
	}

}
