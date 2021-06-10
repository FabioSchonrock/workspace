import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {

		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite um número"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite outro número"));
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior número é o " + n1);
		} else if (n2 > n1) {
			JOptionPane.showMessageDialog(null, "O maior número é o " + n2);				
			} else {
				JOptionPane.showMessageDialog(null, "Os números são iguais!");				
		}
	}
}
