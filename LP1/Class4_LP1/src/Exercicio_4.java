
import java.util.Scanner;

public class Exercico_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		
		Integer a = sc.nextInt();
		
		Integer b = a - 1;
		
		Integer c = a + 1;
		
		System.out.println("Seu antecessor, N�mero e Sucessor s�o: " +b +a +c);
	}

}
