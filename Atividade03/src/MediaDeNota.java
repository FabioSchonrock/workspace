import javax.swing.JOptionPane;

public class MediaDeNota {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� valor"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� valor"));
		JOptionPane.showMessageDialog(null, "A m�dia entre os valores digitados �: " +((nota1 + nota2)/2));

	}

}
