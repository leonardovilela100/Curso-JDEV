package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	@org.junit.Test
	public void testeEmail() throws Exception {
		
		
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		
		stringBuilderTextoEmail.append("<h2>Você está recebendo aceso ao curso de java</h2> <br/><br/>");
		stringBuilderTextoEmail.append("<h2>Para ter acesso clique no botão abaixo</h2> <br/><br/>");
		stringBuilderTextoEmail.append("<b>Login:</br>Leonardo@.com   <br/>");
		stringBuilderTextoEmail.append("<b>Senha:</br>7541654   <br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://portifolioleonardonew.netlify.app\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display: inline-block; border-radios: 30px; font-size: 20px; font-family: courier; border: 3px solid green; background-color: #99DA39; \">Acessar Portal do Aluno</a> <br/><br/>");
		stringBuilderTextoEmail.append(" <span style=\"font-size:8px; \">Ass.: Leonardo Programador</span> <br/>");
		

		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("leovilela100@gmail.com", "Leonardo Dev",
				"Testando E-mail com java",stringBuilderTextoEmail.toString());

		enviaEmail.enviarEmailAnexo(true);

		Thread.sleep(5000);
	}
}
