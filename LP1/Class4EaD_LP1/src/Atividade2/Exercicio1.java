package Atividade2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer resp = 0;
		
		int i = 0;
		
		double total = 0;
		
		do	{
			
			System.out.print("Entre com n�mero inteiro para saber a m�dia dele e 0 para parar: ");
			
			resp = sc.nextInt();
			
			i = i + 1;
			
			total = total + resp;
			
		}
		while ( resp != 0 );
		
		i = i - 1;
		
		total = total/i;
		
		System.out.println("A m�dia dos n�meros inteiros digitados �: " + total );
		System.out.println("A quantidade de n�meros digitalizados foi: " + i );
	}
}
