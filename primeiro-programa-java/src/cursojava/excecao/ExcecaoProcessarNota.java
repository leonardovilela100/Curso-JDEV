package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {
	
public ExcecaoProcessarNota(String erro) {
	super("Vixx um erro no processamento do arquivo ao procesar as notas do aluno "+erro);
	}
}
