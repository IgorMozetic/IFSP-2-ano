package ListaDeExerc�cios6;

public class teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.setNome( "Igor Mozetic" );
		a1.setCurso( "Inform�tica" );
		
		System.out.println( a1.toString() );
		
		Livro l1 = new Livro();
		
		l1.setNome( "larari" );
		l1.setAutor( "O brabo" );
		l1.setEdi��o( "decima" );
		
		System.out.println( l1.toString() );
	}
	
}
