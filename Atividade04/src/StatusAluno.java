import javax.swing.JOptionPane;

public class StatusAluno {

	public static void main(String[] args) {

		String aluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
		float nf = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final"));
		System.out.println(nf);
		JOptionPane.showMessageDialog(null, "O aluno " + aluno + " est� com a nota " + nf + " !");
		if (nf >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno " + aluno + " est� aprovado. Parab�ns!");
		} else if (nf > 4 && nf < 7) {
			JOptionPane.showMessageDialog(null,
					"O aluno " + aluno + " est� em recupera��o. Procure o professor urgentemente!");
		} else if (nf < 4) {
			JOptionPane.showMessageDialog(null, "O aluno " + aluno + " est� reprovado infelizmente!");
		}
	}

}
