import javax.swing.JOptionPane;

public class Gar�om {

	public static void main(String[] args) {
		int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));
		int garcom = ((conta / 100) * 10);
		JOptionPane.showMessageDialog(null,
				"10% do gar�om = " + garcom + System.lineSeparator() + "Valor Total = " + (conta + garcom));
	}

}
