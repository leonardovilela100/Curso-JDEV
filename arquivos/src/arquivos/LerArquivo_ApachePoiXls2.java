package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LerArquivo_ApachePoiXls2 {

	public static void main(String[] args) throws Exception {

		FileInputStream entrada = new FileInputStream(
				new File("C:\\workspace-curso-java-JDEV\\arquivos\\src\\arquivos\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo do excel para ler

		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Peg a primeeira planilha do excel

		Iterator<Row> linhaIterator = planilha.iterator();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (linhaIterator.hasNext()) { // Enquanto tiver linah no arquivo do excel

			Row linha = linhaIterator.next(); // dados da pessoa na linha

			Iterator<Cell> celula = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celula.hasNext()) { // percorre as celulas

				Cell cell = celula.next();

				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;

				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;

				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;

				default:
					break;
				}

			} // Fim das celulas da linha
			pessoas.add(pessoa);
		}
		
		entrada.close(); // Terminou de ler o arquivo excel
		
		for (Pessoa p : pessoas) { // Poderia gravar no banco de dados
			System.out.println(p);
		}
	}

}
