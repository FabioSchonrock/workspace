import javax.swing.JOptionPane;

public class SomaDeValores {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero"));
		JOptionPane.showMessageDialog(null, "A soma dos valores �: " +(numero1 + numero2));
	}

}
