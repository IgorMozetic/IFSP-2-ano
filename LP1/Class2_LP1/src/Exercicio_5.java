
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Entre com tr�s n�meros:");
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		Scanner sc3 = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		if ( a < b && b < c )
			
			System.out.println("A ordem crescente � :" + a + ", " + b + ", " + c );
		
		else
		
			if ( a < c && c < b)
			
			System.out.println("A ordem crescente �: " + a + ", " + c + ", " + b );
		
		else
		
			if ( b < a && a < c )
			
			System.out.println("A ordem crescente �: " + b + ", " + a + ", " + c );
		
		else
					
			if ( b < c && c < a )
						
			System.out.println("A ordem crescente �: " + b + ", " + c + ", " + a );
				
		else
			
			if ( c < a && a < b)
				
				System.out.println("A ordem crescente �: " + c + ", " + a + ", " + b );
			
		else
			
			if ( c < b && b < a )
				
				System.out.println("A ordem crescente �: " + c + ", " + b + ", " + a );
	}

}
