import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois n�meros para saber sua soma, subtra��o e sua multiplica��o.");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		 
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;
		
		System.out.println(" A soma dos valores �: " + soma + "." );
		
		double sub = num1 - num2;
		
		System.out.println(" A subtra��o dos valores �: " + sub + "." );
		
		double multi = num1 * num2;
		
		System.out.println(" A multiplica��o dos valores �: " + multi + "." );

	}

}
