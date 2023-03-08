package cursojava.executavel;

import java.util.Iterator;

public class Matriz {
	
	public static void main(String[] args) {
	
		int notas[][] = new int[2][3];
		
		notas[0][0] = 10;
		notas[0][1] = 20;
		notas[0][2] = 30;
		
		notas[1][0] = 100;
		notas[1][1] = 200;
		notas[1][2] = 300;
		
		// percorre as linhas
		for (int poslinha = 0; poslinha < notas.length; poslinha++) { 
			System.out.println("================================================");
			
			//percorre as colunas
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da matriz"+": " +poslinha+ "  e coluna " + poscoluna+" =  "+ notas[poslinha][poscoluna]);
			}
			
		
		
		}
		
		
	}
}
