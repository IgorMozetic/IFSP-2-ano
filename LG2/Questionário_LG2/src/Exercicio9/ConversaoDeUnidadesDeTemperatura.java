package Exercicio9;

public class ConversaoDeUnidadesDeTemperatura {
	
		private static Double Fahrenheit;
		private static Double Celsius;
		
		public static Double CparaF(Double Celsius)	{
			return  ( 9 * Celsius / 5 ) + 32;
		
		}
		
		public static Double FparaC(Double Fahrenheit)	{
			return  ( Fahrenheit - 32) * 5 / 9;
		}
	}