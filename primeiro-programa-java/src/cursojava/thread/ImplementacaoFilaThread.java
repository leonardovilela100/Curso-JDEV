package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		System.out.println("Fila rodando");
		

		while (true) {
			

			synchronized (pilha_fila) { // Bloquear o acesso a esta lista por outros processos

				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { // Em quanto conter dados na lista era processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					// Processar 10 mil notas fiscais
					// Gerar uma lista enorme de PDFS
					// Gerar um envio em massa de E-mail
					System.out.println("-----------------------");

					System.out.println("Nome: " + processar.getNomeString());

					System.out.println("E-mail: " + processar.getEmailString());

					iteracao.remove();

					try {
						Thread.sleep(1000); // Dar um tempo para descarga de memoria
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					try {
						Thread.sleep(1000); // Processou toda a lista da um tempo de limpesa de memoria
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		// super.run();

	}

}
