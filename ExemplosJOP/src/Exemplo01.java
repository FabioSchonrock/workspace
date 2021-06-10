import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(null, "Olá, Mundo JOP", "!!Alerta!!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
		Object[] options = { "OK", "Cancelar", "VOLTAR" };
		JOptionPane.showOptionDialog(null, "Clique em Ok para continuar!", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		@SuppressWarnings("unused")
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		System.out.println("O nome digitado foi: " + nome);

		Object[] itens = { "Maçã", "Pera", "Banana" };
		Object itemSelecionado = JOptionPane.showInputDialog(null, "Escolha 1 item", "Itens",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[1]);
		System.out.println("Item selecionado: " + itemSelecionado.toString());
	}

}
