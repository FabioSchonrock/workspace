import javax.swing.JOptionPane;

public class NumerosVizinhos {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite um número"));
		int antes, depois;
		antes = numero - 1;
		depois = numero + 1;
		JOptionPane.showMessageDialog(null, "Os números vizinhos são  "+antes +" e " +depois);
	}

}
