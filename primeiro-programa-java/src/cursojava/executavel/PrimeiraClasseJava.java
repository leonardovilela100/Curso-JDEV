package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		
		try {
	
			
		String login =  JOptionPane.showInputDialog("Infome o Login");
		String senha =  JOptionPane.showInputDialog("Infome o senha");
		
		
		
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { // Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo
		
		List<Aluno> alunos = new ArrayList<Aluno>();;
		
		
		// É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		for (int qtd = 1; qtd <= 1; qtd++) {

			// Entrada de dados
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " +qtd +"?");
			String idade = JOptionPane.showInputDialog("Qual a Idade do Aluno");
			/*
			String nascimento = JOptionPane.showInputDialog("Qual a Data do nascimento do Aluno");
			String rg = JOptionPane.showInputDialog("Qual o RG do Aluno");
			String cpf = JOptionPane.showInputDialog("Qual o CPF do Aluno");
			String pai = JOptionPane.showInputDialog("Qual o nome do Pai do Aluno");
			String mae = JOptionPane.showInputDialog("Qual o nome da Mãe do Aluno");
			String matricula = JOptionPane.showInputDialog("Qual é data da Matricula do Aluno");
			String escola = JOptionPane.showInputDialog("Qual o nome da escola do  Aluno");
			String serie = JOptionPane.showInputDialog("Qual o serie do Aluno");
	*/
			
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.parseInt(idade));
			/*
			aluno1.setDataNascimento(nascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNomeEscola(escola);
		
			*/
		
			for (int pos = 1; pos <= 1; pos++) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +pos+" ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " +pos+" ?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				//disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
				
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			
			
			if (escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0  ) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4");
					aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			} 
			
			alunos.add(aluno1); // Adiconado todos os alunos 
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) { // Separando as listas de alunos
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
		}
		//Imprimindo no console as listas 
		
		System.out.println(" ---------------------- Lista dos Aprovados ------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado =  "+aluno.getAlunoAprovado2() 
			+ " com média de = " 
					+ aluno.getMediaNota()
					+"Nome do aluno= "+ aluno.getNome());
			System.out.println();
		}
		
		System.out.println(" ---------------------- Lista dos Reprovados ------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado =  "+aluno.getAlunoAprovado2() 
			+ " com média de = " 
					+ aluno.getMediaNota()
					+"Nome do aluno= "+ aluno.getNome());
			System.out.println();
		}
		
		System.out.println(" ---------------------- Lista dos Recuperados ------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado =  "+aluno.getAlunoAprovado2() 
			+ " com média de = " 
					+ aluno.getMediaNota()
					+"Nome do aluno= "+ aluno.getNome());
			System.out.println();
		} 
		
	}else {
		 JOptionPane.showMessageDialog(null, "Aceso não permitido, Login ou senha incorretos ");
	}
		
		
	} catch (Exception e) {
		
			StringBuilder saida = new StringBuilder();
		
			e.printStackTrace(); // Imprime erro no console Java
			
			// Mensagem do erro ou causa
			System.out.println("Mensagem: " + e.getMessage());
			
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
				saida.append("\n Classe de erro: "+e.getStackTrace()[pos].getClassName());
				saida.append("\\n Método de erro: "+e.getStackTrace()[pos].getMethodName());
				saida.append("\\n Linha de erro de erro: "+e.getStackTrace()[pos].getLineNumber());
				saida.append("\\n Linha de erro de erro: "+e.getClass().getName());
			}
			JOptionPane.showMessageDialog(null, "Erro de conversão de numero: " + saida.toString() );
			
		} finally { // Sempre é executado ocorrendo erros ou não, Porque?
					// Finally sempre e usando quando so precisa executar um processo acontecendo erro ou não no sistema
			JOptionPane.showMessageDialog(null, "Obrigado por apreender java comigo");
			
		}
		
	}//Main
		
}// Classe Pai
