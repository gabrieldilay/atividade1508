package exercicio2;

public class Teste02 {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.salvar());
		
		
		Professor prof = new Professor();
		prof.cpf = "408.444.220-88";
		prof.email = "professor@up.edu.br";
		prof.nome = "Leandro Escobar";
		prof.titulo = "Mestre";
		
		System.out.println("Dados: ");
		System.out.println(prof.cpf);
		System.out.println(prof.email);
		System.out.println(prof.nome);
		System.out.println(prof.salvar());
		
		double[] horas = {24, 18, 18};
		System.out.printf("Total de Horas Trabalhadas: " + prof.horasTrab(horas));
		
		Aluno aluno = new Aluno();
		aluno.cpf = "167.928.250-69";
		aluno.email = "athos.mfrodrigues@gmail.com";
		aluno.nome = "Athos Mantovani Feres Rodrigues";
		
		System.out.println("\n\rDados: ");
		System.out.println(aluno.cpf);
		System.out.println(aluno.email);
		System.out.println(aluno.nome);
		System.out.println(aluno.salvar());
		
		double [] notas = {6, 7};
		System.out.printf("Total de Horas Trabalhadas: " + aluno.media(notas));	
		
	}

}
