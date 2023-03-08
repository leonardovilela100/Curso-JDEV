package principio.responsabilidade;

import java.util.Iterator;

public class TesteConta {

	public static void main(String[] args) {
		ContaBanaria contaBanaria = new ContaBanaria();
		contaBanaria.setDescricao("Conta Bancaria do Leonardo");
		
		System.out.println(contaBanaria);
		
		for (int i = 0; i < 5; i++) {
			contaBanaria.diminui100Reais();
			System.out.println("--");
			
		}
		
		contaBanaria.sacarDinheiro(500);
		contaBanaria.depositarDinheiro(900);

		
		System.out.println(contaBanaria);
		

	}

}
