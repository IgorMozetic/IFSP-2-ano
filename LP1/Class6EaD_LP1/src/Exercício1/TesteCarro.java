package Exerc�cio1;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setMarca( "BMW" );
		c1.setModelo( "I8" );
		c1.setAnodefabrica��o( 2020 );
		
		System.out.println( "Marca: " + c1.getMarca() + "\nModelo: " + c1.getModelo() + "\nAno de Fabrica��o: " + c1.getAnodefabrica��o() );
	
		Carro c2 = new Carro( "Ferrari", "F8", 2020);
		
		System.out.println( "\nMarca: " + c2.getMarca() + "\nModelo: " + c2.getModelo() + "\nAno de Fabrica��o: " + c2.getAnodefabrica��o() );
	}

}
 