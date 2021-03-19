package Exercicio9;
import java.util.Scanner;
public class ConversãoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println( "Pressione 1 para converter de Celsius para Fahrenheint\nPressione 2 para converter de Fahrenheint para Celsius" );
		
		int resposta = sc.nextInt();
		
		if ( resposta == 1 ) {
			
			System.out.print(" Insira a temperatura para ser convertida: ");
			Double resultado = ConversaoDeUnidadesDeTemperatura.CparaF( sc.nextDouble() );
			System.out.print( "A temperatura em Fahrenheint é: " + resultado + "°F" );
		}
		else	{
			System.out.print(" Insira a temperatura para ser convertida: ");
			Double resultado = ConversaoDeUnidadesDeTemperatura.FparaC( sc.nextDouble() );
			System.out.print( "A temperatura em Celsius é: " + resultado + "°C");
		}
	}
}
