package br.caelum.estruturaalunos;

import java.util.Arrays;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	
	private int totaldeAlunos = 0;
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totaldeAlunos;
	}
	
	private boolean posicaoValida(int posicao){
		return posicao >= 0 && posicao <= this.totaldeAlunos;
	}
	
	public void adiciona(Aluno aluno){
		
		this.alunos[this.totaldeAlunos] = aluno;
		this.totaldeAlunos ++;
		
	}
	
	public void adiciona(int posicao, Aluno aluno){
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida");
		}
		
		for (int i = totaldeAlunos - 1; i >= posicao; i-=1) {
			this.alunos[i + 1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.totaldeAlunos++;
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
		for (int i = 0; i < this.totaldeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
				
		}
		return false;
		
	}
	
	public int tamanho(){
		
		return this.totaldeAlunos;
	}
	
	public String toString(){
		if (this.totaldeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		
		for (int i = 0; i < this.totaldeAlunos; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
			
		}
		
		builder.append(this.alunos[this.totaldeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
		
	}
	
	
	
	
}
