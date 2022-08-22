package exercicio2;

public class Aluno extends Pessoa {

	String matricula;
	
	public String salvar() {
		return "Salvando o aluno no banco de dados";
	}
	
	//public double calcMedia(int a, int b) {
	//	return (a+b)/2;
	//}
	
	public double media(double[] notas) {
		
		double media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}
		
		return media/notas.length;
	}
}
