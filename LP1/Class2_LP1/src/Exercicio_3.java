
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		System.out.println("Entre com dois n�meros: ");
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc2.nextDouble();
		
		double soma = a + b;
		
		System.out.println(" A soma dos valores �: " + soma);
		
		double sub = a - b;
		
		System.out.println(" A subtra��o dos valores �: " + sub);
		
		double multi = a * b;
		
		System.out.println(" A multiplica��o dos valores �: " + multi);


	}

}
