package Exercicio4Composição;

public class TesteComposição {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente( "5", "Edinaldo Perira", "109876543-21", "11", "12345-6789", "123456-78", "Rua da canjuca", "9", "Apt.20", "Bairro das canjicas", "Sopa de galinhas", "SG" );
		Cliente cli2 = new Cliente( "6", "Lorescreusa Perira", "123456789-10", "11", "12345-6789", "123456-78", "Rua da canjuca", "9", "Apt.20", "Bairro das canjicas", "Sopa de galinhas", "SG"  );
		System.out.println( cli1.getCliente() + cli2.getCliente() );
	}

}
