package exercicio2;

public class Professor extends Pessoa {

	public String titulo;
	
	public String salvar() {
		return "Salvando o professor no banco de dados";
	}
	
	public double horasTrab(double[] horas) {
		double horasTrab = 0;
		
		for(int i = 0; i < horas.length; i++) {
			horasTrab = horasTrab + horas[i];
		}
		
		return horasTrab;
	}
}
