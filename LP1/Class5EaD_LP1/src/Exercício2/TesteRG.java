package Exerc�cio2;

public class TesteRG {

	public static void main(String[] args) {
		
		RG rg1 = new RG();
		
		rg1.setNome("Igu");
		rg1.setDataemiss�o("10/10/2010");
		rg1.setN�mero("12345678-9");
		
		System.out.println( "Nome: " + rg1.getNome() + "\nData de Emiss�o: " + rg1.getDataemiss�o() + "\nN�mero: " + rg1.getN�mero() );
	}
}
