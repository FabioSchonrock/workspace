import javax.swing.JOptionPane;

public class SalarioDoFuncionario {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do funcionário");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora"));
		JOptionPane.showMessageDialog(null, "O salário de " + nome + " é R$ " + (valor * horas) + ",00");

	}

}
