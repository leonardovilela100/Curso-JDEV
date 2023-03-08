package cursojava.executavel;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		String texto = "Leonardo,Curso java,80,70,90,75";
		
		String[] valoresArray = texto.split(",");
		
		// Convetendo um array em uma lista
		List<String> list = Arrays.asList(valoresArray);
		
	
		for (String percorer : list) {
			System.out.println(percorer);
		}
		
		//Conveter a lista para um array
		
		String[] convesaoarrayStrings = list.toArray(new String[6]);
		
		for (int i = 0; i < convesaoarrayStrings.length; i++) {
			System.out.println(convesaoarrayStrings[i]);
			
		}
		
		
		
	}
	

}
