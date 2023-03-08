package cursojava.thread;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		

	
		System.err.println("Parou");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Runnable thread1 = new Runnable() {
		
		public void run() {
			
			for(int pos =0; pos < 10; pos++) {
				
				System.out.println("Execurtando alguma rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			System.err.println("Parou a Theread de enviar E-mail");
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {

		public void run() {
			for(int pos =0; pos < 10; pos++) {
				System.out.println("executando envio de nota fiscal");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			System.err.println("Parou a Theread de criar Nota Fiscal");
		}
		
	};

}
