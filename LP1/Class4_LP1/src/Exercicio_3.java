
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com un N�mero referente aos dias da semana: ");
		
		int DiasDaSemana = sc.nextInt();
		
		switch ( DiasDaSemana ) {
		default :
				System.out.println("Este � um dia inv�lido!");
				break;
		case 1: 
				System.out.println("Domingo, fim de semana");
				break;
		case 2:
				System.out.println("Segunda-feira, dia �til");
				break;
		case 3:
				System.out.println("Ter�a-feira, dia �til");
				break;
		case 4:
				System.out.println("Quarta-feira, dia �til");
				break;
		case 5:
				System.out.println("Quinta-feira, dia �til");
				break;
		case 6:
				System.out.println("Sexta-feira, dia �til");
				break;
		case 7:
				System.out.println("S�bado, fim de semana");
				break;
		}
		
	}

}
