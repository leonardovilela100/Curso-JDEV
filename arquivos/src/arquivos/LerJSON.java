package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LerJSON {
	
	public static void main(String[] args) throws Exception {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setCpf("12370846607");
		usuario1.setLogin("123");
		usuario1.setSenha("123");
		usuario1.setNome("Leonardo Carvalho");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setCpf("74846567");
		usuario2.setLogin("159357");
		usuario2.setSenha("159357");
		usuario2.setNome("Claudiene Silva");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\workspace-curso-java-JDEV\\arquivos\\src\\arquivos\\filejson.json");
		
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}
	

}
