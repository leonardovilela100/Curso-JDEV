package pos_java_jdbc.pos_java_jdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("TesteId");
		userposjava.setEmail("TesteId@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	
	
	@Test
	public void initListar()  {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initbuscar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.Buscar(1L);
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initAtulizar() {
		try {
			UserPosDAO dao = new UserPosDAO();
			
			Userposjava objetoBanco = dao.Buscar(5L);
			
			objetoBanco.setNome("Atualizou com metodo atualizar");
			
			dao.atualizar(objetoBanco);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initDeletar() {
		
		try {
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(8L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeInsertTelefone () {
		
		Telefone telefone = new Telefone();
		UserPosDAO dao = new UserPosDAO();
		
		telefone.setNumero("+553426238");
		telefone.setTipo("Casa");
		telefone.setUsuario(50L);
		
		dao.salvarTelefone(telefone);
	}
	
	@Test
	public void testeCarregaFonesUser() throws Exception {
		
		UserPosDAO dao = new UserPosDAO();
		
		List<BeanUserFone> beanUserFones = dao.listaUserFone(9L);
		for (BeanUserFone list : beanUserFones) {
			System.out.println(list);
			System.out.println("----------------------------");
		}
	}
	
	
	@Test
	public void testeDeleteUserFone() {
		
		UserPosDAO dao = new UserPosDAO();
		dao.deleteFonesPorUser(9L);
		
	}
	
	
	
}
