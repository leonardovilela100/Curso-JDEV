package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		double[] notas = {9,8.9,5.6,7};
		double[] notas2 = {5,2,5,10};
	
		Aluno aluno = new Aluno();
		aluno.setNome("lenardo Carvalho Vilela");
		aluno.setNomeEscola("JDEV Treiamentos");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de Banco de Dados");
		disciplina2.setNota(notas2);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//-------------------------------------------------

	
		Aluno aluno2 = new Aluno();
		aluno2.setNome("lenardo Carvalho Vilela 2");
		aluno2.setNomeEscola("JDEV Treiamentos 2");
		
		Disciplina disciplinai = new Disciplina();
		disciplinai.setDisciplina("Curso de Java 2");
		disciplinai.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplinai);
		
		Disciplina disciplina2i = new Disciplina();
		disciplina2i.setDisciplina("Curso de Banco de Dados 2");
		disciplina2i.setNota(notas2);
		
		aluno2.getDisciplinas().add(disciplina2i);
		
		
		
		//-------------------------------------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		
		for(int pos=0; pos < arrayAlunos.length; pos++) {
			System.out.println(" ");
			System.out.println("Nome do aluno é: "+ arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é: "+d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A  nota número " + (posnota + 1)+" é igual = " + d.getNota()[posnota]);
					
				}
			}
			
		}
		
		
		
		
		
		

		
		
		
		
		
		
	}
	
}


/*
System.out.println("Nome do aluno: " + aluno.getNome()+ " Inscrito no curso " + aluno.getNomeEscola());
System.out.println("----------- Disciplinas do aluno -----------");
for (Disciplina d : aluno.getDisciplinas()) {
	 System.err.println("   "); 
	 System.out.println("Disciplina: " + d.getDisciplina());
	 System.out.println("As notas da disciplina são: ");
	 
	 double notamin = 0.0;
	 double notaMax = 0.0;
	 for(int pos=0;pos < d.getNota().length; pos++ ) {
		 System.out.println("Nota: " +( 1 + pos )+ " é igual = "+ d.getNota()[pos]);
		 
		 // if de maior nota
		 if(pos == 0) {
			 notaMax = d.getNota()[pos]; 
		 }else { 
			if(d.getNota()[pos] > notaMax ) {
				notaMax = d.getNota()[pos];
			}
		}
		 
		 if(pos == 0) {
			 notamin = d.getNota()[pos]; 
		 }else { 
			if(d.getNota()[pos] < notamin ) {
				notamin = d.getNota()[pos];
			}
		}

	 }
	 System.out.println("A maior nota da disciplina "+d.getDisciplina() +" e de valor:  " + notaMax);
	 System.out.println("A menor nota da disciplina "+d.getDisciplina() +" e de valor:  " + notamin);
}
*/
