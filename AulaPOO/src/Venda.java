import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private long id;
	
	private String descricaoVenda;
	
	private String nomeCliente;
	
	private String enderecoEntrega;
	
	private BigDecimal valorTotal;
	
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void addProduto (Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	public double totalVenda() {
		
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		this.valorTotal = BigDecimal.valueOf(total);
		return total;
		
	}
	

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}

	
	
	
	
}
