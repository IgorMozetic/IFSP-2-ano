package Exerc�cio2;

public class TesteRG {

	public static void main(String[] args) {
		
		RG r1 = new RG();
		
		r1.setNome( "Neymar Junior" );
		r1.setDataemiss�o( "01/01/2020" );
		r1.setN�mero( "12345678-9" );
		
		System.out.println( "Nome: " + r1.getNome() + "\nData de emis�o: " + r1.getDataemiss�o() + "\nN�mero: " + r1.getN�mero() );
		
		RG r2 = new RG( "Arlindo Souza", "01/01/2019", "98765432-1" );
		
		System.out.println( "\nNome: " + r2.getNome() + "\nData de emis�o: " + r2.getDataemiss�o() + "\nN�mero: " + r2.getN�mero() );
		
		

	}

	
	
}
