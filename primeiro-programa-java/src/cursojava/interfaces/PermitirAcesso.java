package cursojava.interfaces;

// Esse Interface sera o nosso contrato de autenticação.
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}
