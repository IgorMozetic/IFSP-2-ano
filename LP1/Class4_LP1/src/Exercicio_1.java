
import java.util.Scanner;

public class Exercico_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome de um dos 4 maiores de S�o Paulo");
		
		String times = sc.nextLine();
		
		switch ( times )	{
		default:
				System.out.println( "Seu time n�o existe! ");
				break;
		case "Corinthians":
				System.out.println("Campe�o");
				break;
		case "Santos":
				System.out.println("Campeonato fica para o pr�ximo ano");
				break;
		case "Palmeiras":
				System.out.println("Campeonato fica para o pr�ximo ano");
				break;
		case "S�o_Paulo":
				System.out.println("Campeonato fica para o pr�ximo ano");
				break;
		}
		
	}

}
