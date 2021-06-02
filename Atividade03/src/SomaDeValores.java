import javax.swing.JOptionPane;

public class SomaDeValores {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
		JOptionPane.showMessageDialog(null, "A soma dos valores é: " +(numero1 + numero2));
	}

}
