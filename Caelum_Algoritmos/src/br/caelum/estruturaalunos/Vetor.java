package br.caelum.estruturaalunos;

import java.util.Arrays;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	
	private int TotaldeAlunos = 0;
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.TotaldeAlunos;
	}
	
	
	public void adiciona(Aluno aluno){
		
		this.alunos[this.TotaldeAlunos] = aluno;
		this.TotaldeAlunos ++;
		
	}
	
	public void adiciona(int posicao, Aluno aluno){
		//implementação
	}
	
	public Aluno pega(int posicao){
		
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida");
		}
		
		return this.alunos[posicao];
	}
	
	public void remove(int posicao){
		//implementação
	}
	
	public boolean contem(Aluno aluno){
		for (int i = 0; i < this.TotaldeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
				
		}
		return false;
		
	}
	
	public int tamanho(){
		
		return this.TotaldeAlunos;
	}
	
	public String toString(){
		if (this.TotaldeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		
		for (int i = 0; i < this.TotaldeAlunos; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
			
		}
		
		builder.append(this.alunos[this.TotaldeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
		
	}
	
	
	
	
}
