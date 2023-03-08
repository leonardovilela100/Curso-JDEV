package principio.responsabilidade;

public class ContaBanaria {

	private String descricao;
	
	private double  saldo = 8000;
	
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro (double saque) {
		saldo -= saque;
	}
	
	public void depositarDinheiro (double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String toString() {
		return "ContaBanaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	

	
}
