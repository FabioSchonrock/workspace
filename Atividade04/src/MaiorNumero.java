import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {

		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite um n�mero"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, digite outro n�mero"));
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero � o " + n1);
		} else if (n2 > n1) {
			JOptionPane.showMessageDialog(null, "O maior n�mero � o " + n2);				
			} else {
				JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais!");				
		}
	}
}
