public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer cont = new Integer(0);
		
		Integer soma = new Integer(0);
		
		while( cont < 1001) {
			
			soma = soma + cont;
			
			cont = cont + 1;
		}
		System.out.println("O valor da soma dos n�meros de 1 at� 1000 �: " + soma);
	}

}
