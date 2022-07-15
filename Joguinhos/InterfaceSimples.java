package jogos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceSimples {
	private JFrame mainFrame;
	private JLabel headLabel;
	private JLabel msgLabel;
	private JPanel mainPanel;

	public InterfaceSimples() {
		mainFrame = new JFrame("Interface Gráfica");
		mainFrame.setSize(300, 230);
		mainFrame.setLayout(new GridLayout(3, 1));

		headLabel = new JLabel("Classe JButton", JLabel.CENTER);
		msgLabel = new JLabel("Nenhuma ação", JLabel.CENTER);
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());

		mainFrame.add(headLabel);
		mainFrame.add(mainPanel);
		mainFrame.add(msgLabel);
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		InterfaceSimples demonstracao = new InterfaceSimples();
		demonstracao.mostraBotao();
	}

	private void mostraBotao() {

		JButton botaoA = new JButton("A");
		JButton botaoB = new JButton("B");
		JButton botaoC = new JButton("C");

		// Listner para botão A
		botaoA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgLabel.setText("Botão \"A\" clicado.");
			}
		});

		// Listner para botão B
		botaoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgLabel.setText("Botão \"B\" clicado.");
			}
		});

		// Listner para botão C
		botaoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgLabel.setText("Botão \"C\" clicado.");
			}
		});

		mainPanel.add(botaoA);
		mainPanel.add(botaoB);
		mainPanel.add(botaoC);

		mainFrame.setVisible(true);
	}
}
