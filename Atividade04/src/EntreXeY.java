import javax.swing.JOptionPane;

public class EntreXeY {

	public static void main(String[] args) {
		
		
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite outro n�mero"));
		int i;
		if (n1 < n2) {
			int dif = n2 - n1 - 1;
			//System.out.println(dif);
			for (i = dif; i < n2; i++) {
				System.out.println(i);
				//JOptionPane.showMessageDialog(null, "Os n�meros entre " + n1 + "e" + n2 +"s�o: " + i );
			}
		}
	}
}
