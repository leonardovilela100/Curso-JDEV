package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscreverArquivosTxt {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("Leonardo@gmail.com");
		pessoa1.setNome("Leonardo Carvalho");
		pessoa1.setIdade(26);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("Claudiene@gmail.com");
		pessoa2.setNome("Claudiene Sousa");
		pessoa2.setIdade(22);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("maria@gmail.com");
		pessoa3.setNome("maria Carvalho");
		pessoa3.setIdade(55);

		// Essa list apode vir do banco de dados ou fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		System.out.println(pessoas);

		File arquivo = new File("C:\\\\workspace-curso-java-JDEV\\\\arquivos\\\\src\\\\arquivos\\\\arquivo.txt"); // Unica coisa que muda e o nome do arquivo

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter escreve_no_arquivo = new FileWriter(arquivo);
		for (Pessoa p : pessoas) {
			escreve_no_arquivo.write(p.getNome()+";" + p.getEmail()+";"+ p.getIdade()+"\n");
		

		}
		
		escreve_no_arquivo.flush();
		escreve_no_arquivo.close();
		System.out.println("Escreveu com suceso");
	}

}
