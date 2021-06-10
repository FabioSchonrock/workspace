import javax.swing.JOptionPane;

public class PalavraDeAcesso {
	public static void main(String[] args) {
		String p1 = JOptionPane.showInputDialog("Por favor digite a palavra passe!");
		String p2 = "Java-2021";
		if (!p1.equals(p2)) {
			for (int i = 2; i > 1 && i <= 2; i--) {
				JOptionPane.showMessageDialog(null,
						"Acesso negado! Tente novamente. Você tem apenas + " + i + " tentativas");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso permitido!");
		}

	}
}