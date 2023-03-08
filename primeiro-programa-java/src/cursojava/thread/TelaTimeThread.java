package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Gera Lote");
	private JButton jButton2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() { // Executa oque tiver dentro no momento da abertura ou execuçao

		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false); // Nao deixa eu ajustar a tela
		// Primeira parte concluida, ajustando as configuraçoes iniciais
		// -------------------------------------------------------------------------------------

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posiçao
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;

		// -------------------------------------------------------------------------------------

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints); // label

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints); // Input

		// -------------------------------------------------------------------------------------

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints); // Label

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridBagConstraints); // Input
		// -------------------------------------------------------------------------------------

		gridBagConstraints.gridwidth = 1;
		// -------------------------------------------------------------------------------------

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints); // Botao

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints); // Botao

		// -------------------------------------------------------------------------------------

		// -- Start do botao
		jButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) { // executa o click no botao

				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}

				for (int qtd = 0; qtd < 100; qtd++) {// smulando 100 envios em massa

					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNomeString(mostraTempo.getText());
					filaThread.setEmailString(mostraTempo2.getText() + " - " + qtd);

					fila.add(filaThread);
				}
			}
		});
		// -- Stop do botao
		jButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;

			}
		});

		fila.start();
		add(jPanel, BorderLayout.WEST);
		// Ultimo Comando
		setVisible(true);
	}

}
