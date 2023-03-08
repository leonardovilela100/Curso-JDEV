package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		/*
		String testeString = "leoanrdo";
		testeString += "leonardo2,";
		testeString += "leonardo3,";
		testeString += "leonardo4,";
		System.out.println(testeString);
		*/
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Leonardo CV");
		aluno.setIdade(20);
		
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Bolsonaro");
		diretor.setTempoDirecao(4);
		diretor.setIdade(50);
		
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Luiz Ricardo");
		secretario.setExperiencia("Meio Ambiente");
		secretario.setIdade(25);

		
		
		
		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println((diretor.pessoaMaiorIdade() == true ? "Maior de idade": "Menor de idade" ));
		System.out.println((secretario.pessoaMaiorIdade() == true ? "Maior de idade": "Menor de idade" ));
		
		System.out.println("Salario do Aluno é = " + aluno.salario());
		System.out.println("Salario do Diretor é = " + diretor.salario());
		System.out.println("Salario do Secretario é = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		System.err.println("----------");
		
		//System.out.println(secretario.autenticar());
	}
	
	public static void teste(Pessoa pessoa ) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + "e o salario é de = " + pessoa.salario());
	}

}
