import javax.swing.JOptionPane;

public class NumerosVizinhos {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite um n�mero"));
		int antes, depois;
		antes = numero - 1;
		depois = numero + 1;
		JOptionPane.showMessageDialog(null, "Os n�meros vizinhos s�o  "+antes +" e " +depois);
	}

}
