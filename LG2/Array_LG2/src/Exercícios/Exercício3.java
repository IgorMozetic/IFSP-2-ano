package Exerc�cios;

public class Exerc�cio3 {

	public static void main(String[] args) {
		
		Integer array1[][] = new Integer[100][100];
		int cont1 = 0;
		int cont2 = 0;
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
  			   array1[cont1][cont2] = cont1 - cont2; 
	        }   
        }
		
		System.out.println("Os valores da subtra��o dos indices s�o: " );
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
            	System.out.println(array1[cont1][cont2]);
            }
		}
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
  			   array1[cont1][cont2] = 7 * (cont1 - cont2) ; 
            }
		}
		
		System.out.println("Os valores da subtra��o dos indices multiplicados por 7 s�o: " );
		
		for ( cont1 = 0; cont1 < 100; cont1++ ) {
            for ( cont2 = 0; cont2 < 100; cont2++ ){
            	System.out.println(array1[cont1][cont2]);
            }
		}
	}
}