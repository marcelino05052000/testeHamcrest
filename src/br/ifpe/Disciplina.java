package br.ifpe;

public class Disciplina {
	private String nome;
	private float[] notas = new float[4];

	public Disciplina(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(float nota, int unidade) {
		notas[unidade] = nota;
	}
	
	public float getNota(int unidade) {
		return notas[unidade];
	}
}
