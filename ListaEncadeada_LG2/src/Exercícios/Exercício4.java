package Exerc�cios;

import java.util.LinkedList;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Integer maior = 0;
		
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(8);
		
		System.out.println( "Os elementos presentes na lista s�o: " + lista );


		for( int contador = 0; contador < lista.size() ; contador++ )	{
			
			if ( maior < lista.get(contador))	
				maior = lista.get(contador);
			}
			
			System.out.println("O maior elemento da lista �: " + maior);
		}
	}

