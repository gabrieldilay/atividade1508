package exercicio1;

public class Calculadora {

	int i, j; 
	//float i2, j2;
	//String i3, j3;
	
	
	public Calculadora (int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Calculadora (float i, float j) { //achar um jeito de alterar de float para int
		this.i = (int)i;
		this.j = (int)j;
	}
	
	public Calculadora (String i, String j) { //achar um jeito de alterar de String para int
		this.i = Integer.parseInt(i);
		this.j = Integer.parseInt(j);
	}
	
	public int somar() {
//		int somar = i + j;
//		return somar;
		return i + j;
	}
	
	
}
