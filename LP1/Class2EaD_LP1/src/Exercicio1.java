public class Exercicio1 {

	public static void main(String[] args) {
		
		Integer numero = new Integer(150);
		System.out.println("Os n�meros de 150 at� 300 s�o: ");
		while ( numero < 301 ) {
			
			System.out.print( numero + ", " );
			
			numero = numero + 1;
		}
	}

}
