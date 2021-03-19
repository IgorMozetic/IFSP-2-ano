package exercicio4;
import java.util.Scanner;
public class Operações {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char operação = 0;
		int contador = 0;

		do {
		System.out.println( "Digite a Operação." ); 
		System.out.println( "+ => Soma;\n- => Subtração;" );
		System.out.println( "* => Multiplicação;\n/ => Divisão." ); 
		operação = sc.next().charAt(0);

		if ( operação == '+' )	{
			System.out.println( "Digite o Primeiro Valor: " ); 
			System.out.println( "Digite o Segundo Valor: "); 
			Double soma = Calculadora.Soma (sc.nextDouble(), sc.nextDouble() );
			System.out.println( "Resultado: " + soma );
		}
		 
		if ( operação == '-' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double sub = Calculadora.Subtração( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + sub);
		}
		
		if ( operação == '*' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double mult = Calculadora.Multiplicação( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + mult );
		 
		}
		if ( operação == '/' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double div = Calculadora.Divisão( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + div );

		}
		System.out.println("Pretende Continuar?\n 1 - Sim\n 0 - Não"); contador = sc.nextInt();
		}
		while (contador == 1);
		}
}
