import javax.swing.JOptionPane;

public class PalavraDeAcesso {

	public static void main(String[] args) {
			String passe;
			String senha = "Java-2021";
			int tent = 2;
			passe = JOptionPane.showInputDialog("Por favor digite a palavra passe!");
			if (passe.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Acesso liberado!");
			} else
				do {
				JOptionPane.showMessageDialog(null,
						"Palavra incorreta! Por favor digite novamente.\n Restam apenas " + tent + " tentativas!");
				passe = JOptionPane.showInputDialog("Por favor digite a palavra passe!");
				tent--;
			} while (!senha.equals(passe) || tent >= 0);

		}

	}