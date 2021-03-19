package exercicio3;
import java.util.Scanner;
public class criação_carros {

	public static void main(String[] args) {
		carro car = new carro();
		Scanner sc = new Scanner( System.in );
		int contador=0;

		do {
			System.out.println( "Nos informe sobre." );

			System.out.println( "Marca; \nModelo; \nAno. " ); 
			
			car.setCarro( sc.next(), sc.next(), sc.nextInt() ); 
			
			System.out.println( "Carros Registrados: " + carro.getCarros() ); 
			
			System.out.println( "Deseja Continuar?\n 1 - Sim\n 0 - Não" );
			
			contador = sc.nextInt();
		}
		while (contador==1);
	}

}
