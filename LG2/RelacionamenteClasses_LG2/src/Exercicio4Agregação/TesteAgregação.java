package Exercicio4Agrega��o;

public class TesteAgrega��o {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		Telefone tel = new Telefone();
		Endere�o end = new Endere�o();
		
		tel.setTelefone( "11", "12345-6789" );
		end.setEndere�o( "123456-78", "Rua da canjuca", "9", "Apt.20", "Bairro das canjicas", "Sopa de galinhas", "SG" );
		cli1.setCliente( "5", "Edinaldo Perira", "123456789-10", tel, end );
		cli2.setCliente( "6", "Lorescreusa Perira", "123456789-10", tel, end );
		System.out.println( cli1.getCliente() + cli2.getCliente() );
	}
}