package Exerc�cios;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		Integer array1[] = new Integer[9];
		int contador = 0;
		
		for ( contador = 0; contador < array1.length; contador++ )	{
			array1[contador] = contador;
		}
		
		System.out.println("Os elemnetos do array s�o: ");
		
		for ( contador = 0; contador < array1.length; contador++ )	{
			System.out.println( array1[contador] );
		}
		
		for ( contador = 0; contador < array1.length; contador++ )	{
			array1[contador] = array1[contador] * 3;
		}
		
		System.out.println("Os elemnetos do array multiplicados por 3 s�o: ");
		
		for ( contador = 0; contador < array1.length; contador++ )	{
			System.out.println( array1[contador] );
		}
	}
}
