import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		produto1.setId(1L);
		produto1.setNome("Modulo orientação objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		
		produto2.setId(2L);
		produto2.setNome("Modulo de SPRING BOOT API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		
		produto3.setId(3L);
		produto3.setNome("Modulo Angular 8");
		produto3.setValor(BigDecimal.valueOf(100));
		
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Leonardo Carvalho");

		
		venda.addProduto(produto1);//Consigo fazer validações antes de adicionar na lista
		venda.getListaProdutos().add(produto2);// Não consigo validar nada
		venda.getListaProdutos().add(produto3);
		
			for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição do Produto" + produto);
	
		}
		System.out.println("Total da venda é: "+venda.totalVenda());
			
		System.out.println("--------------------------------");
		
		System.out.println(venda);

	}

}
