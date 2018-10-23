package br.ifpe;

public class Matricula {
	private Aluno aluno;
	private Disciplina disciplina;
	
	public Matricula(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
	public String nomeAluno() {
		return aluno.getNome();
	}
	
	public String nomeDisciplina() {
		return disciplina.getNome();
	}
	
	public float nota(int unidade) {
		return disciplina.getNota(unidade);
	}
	
	public float media() {
		float media = disciplina.getNota(0);
		media      += disciplina.getNota(1);
		media      += disciplina.getNota(2);
		media      += disciplina.getNota(3);
		return media / 4;
	}
}
