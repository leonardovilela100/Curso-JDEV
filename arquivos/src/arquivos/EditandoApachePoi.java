package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditandoApachePoi {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\workspace-curso-java-JDEV\\arquivos\\src\\arquivos\\arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo xls excel
		
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) { // Enquanto tiver linha
			Row linha = linhaIterator.next(); // dados da pessoa na linha
			
			Integer numerosCelulas = linha.getPhysicalNumberOfCells();//Quantidade de celula	
			
			Cell cell = linha.createCell(numerosCelulas); // Cria nova celula na linha
			
			cell.setCellValue("5.487,20");
		}
			entrada.close();
		
			FileOutputStream saida = new FileOutputStream(file);
			
			hssfWorkbook.write(saida);
			
			saida.flush();
			saida.close();
			
			System.out.println("Planilha atualizada");
		
	}

}
