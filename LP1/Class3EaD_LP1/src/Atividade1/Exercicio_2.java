package Atividade1;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		
		double total = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��s voc� comprou?");
		
		int quantidade = sc.nextInt();
		
		if ( quantidade < 12 ) {
			total = quantidade * 0.30;
			System.out.println("O pre�o que voc� ir� pagar �: " + total );
		}
		else {
			total = quantidade * 0.25;
			System.out.println("O pre�o que voc� ir� pagar �: " + total );
		}
	}
}
