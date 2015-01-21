package br.caelum.estruturaalunos;

public class TesteContemAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a1.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1));
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(lista.contem(aluno));
		
		

	}

}
