package Atividade2;

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Os n�meros pares de 1 a 200 s�o");
		
		for( int num = 1; num <= 200; num++)	{
			
			if ( num % 2 == 0)
				System.out.print(num + ", ");
		}
	}
}
