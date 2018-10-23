package br.ifpe;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Teste {

	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void testMatricular() {
		Aluno aluno = new Aluno("Roberto");
		Disciplina disciplina = new Disciplina("Historia");
		
		Matricula matricula = new Matricula(aluno, disciplina);
		
		//verifica nome do aluno
		error.checkThat(matricula.nomeAluno(), IsEqual.equalTo(aluno.getNome()));
		
		//verifica nome da disciplina
		error.checkThat(matricula.nomeDisciplina(), IsEqual.equalTo(disciplina.getNome()));
		
		//verifica nota
		error.checkThat(matricula.nota(2), IsEqual.equalTo(disciplina.getNota(2)));
		
		//verifica media
		error.checkThat(matricula.media(), IsEqual.equalTo((disciplina.getNota(0)+disciplina.getNota(1)+disciplina.getNota(2)+disciplina.getNota(3))/4));
	}

}
