package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LerArquivo_ApachePoiXls {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\workspace-curso-java-JDEV\\arquivos\\src\\arquivos\\arquivo_excel.xls");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		

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
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("Ricardo@gmail.com");
		pessoa4.setNome("Ricardo Franco");
		pessoa4.setIdade(65);

		// Essa list apode vir do banco de dados ou fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // Vai ser usado para escrever na planilha
		
		HSSFSheet linhasPessoa =  hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento"); // Criar planilha
		
		int numerolinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numerolinha ++);
			
			int  celula = 0;
			
			Cell celNome = linha.createCell(celula++);//Celula 1
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);//Celula 2
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);//Celula 3
			celIdade.setCellValue(p.getIdade());
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		
		hssfWorkbook.write(saida); // Escreve a planilha em arquivo
		saida.flush();
		saida.close();
		
		System.out.println("Planila foi criada");
		
	}

}
