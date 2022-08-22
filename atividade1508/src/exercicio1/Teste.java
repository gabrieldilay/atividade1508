package exercicio1;

public class Teste {

	public static void main(String[] args) {
		Calculadora paraInt = new Calculadora (2, 5);
		System.out.println(paraInt.somar());
		
		
		Calculadora paraFloat = new Calculadora (4, 6);
		System.out.println(paraFloat.somar());
		
		
		Calculadora paraString = new Calculadora (12, 7);
		System.out.println(paraString.somar());
	}
	
}
