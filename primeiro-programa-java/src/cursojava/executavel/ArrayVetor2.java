package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayVetor2 {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		
		
		
		String texto = "Quantas posições o array deve ter?";
		
		String posicoeString = JOptionPane.showInputDialog(texto);
		
		
		/*Array deve ter uma quantidade de posições definidas*/
		double[] notas = new double[Integer.parseInt(posicoeString)];
		
		for (int i = 0; i < notas.length; i++) {
			
			String texto2 = "Escreva numero da nota " + (i + 1);
			String valor = JOptionPane.showInputDialog(texto2);
			notas[i] = Double.parseDouble(valor);
		}
		

		int notasi = 1;
		for (int i = 0; i < notas.length; i++) {	
			System.out.println("Nota "+ notasi +" "+notas[i]);
			notasi++;	
		}
	
		
		
		

		/*	
	//double[] valor = {9.5, 8.9, 5.8, 100.8};
		
	//String[] valoreStrings = new String[5];
	 * 
	valoreStrings[0] = "leonardo";
	valoreStrings[1] = "Clauzinha";
	valoreStrings[2] = "Academia";
	*/
		/*
	String[] valoreStrings = {"leonardo","Clauzinha","Academia","leovilela100@gmail.com"};
		
	for (int i = 0; i < valoreStrings.length; i++) {
		System.out.println(valoreStrings[i]);
		
	}
		
	*/
		
		
	}
	
}
