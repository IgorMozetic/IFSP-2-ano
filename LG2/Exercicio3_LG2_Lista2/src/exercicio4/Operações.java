package exercicio4;
import java.util.Scanner;
public class Opera��es {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char opera��o = 0;
		int contador = 0;

		do {
		System.out.println( "Digite a Opera��o." ); 
		System.out.println( "+ => Soma;\n- => Subtra��o;" );
		System.out.println( "* => Multiplica��o;\n/ => Divis�o." ); 
		opera��o = sc.next().charAt(0);

		if ( opera��o == '+' )	{
			System.out.println( "Digite o Primeiro Valor: " ); 
			System.out.println( "Digite o Segundo Valor: "); 
			Double soma = Calculadora.Soma (sc.nextDouble(), sc.nextDouble() );
			System.out.println( "Resultado: " + soma );
		}
		 
		if ( opera��o == '-' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double sub = Calculadora.Subtra��o( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + sub);
		}
		
		if ( opera��o == '*' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double mult = Calculadora.Multiplica��o( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + mult );
		 
		}
		if ( opera��o == '/' )	{
		System.out.println( "Digite o Primeiro Valor: " ); 
		System.out.println( "Digite o Segundo Valor: " ); 
		Double div = Calculadora.Divis�o( sc.nextDouble(), sc.nextDouble() );
		System.out.println( "Resultado: " + div );

		}
		System.out.println("Pretende Continuar?\n 1 - Sim\n 0 - N�o"); contador = sc.nextInt();
		}
		while (contador == 1);
		}
}
