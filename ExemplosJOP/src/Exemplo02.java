import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {

		String sexo = JOptionPane.showInputDialog(null, "Digite M para masculino ou F para feminino!");
		String mensagem = "";

		if (sexo.length() != 1) {
			mensagem = "Digite apenas 1 caracter!";
		} else if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		} else if (sexo.toUpperCase().equals("F")) {
			mensagem = "Feminino";
		} else {
			mensagem = "Valor n�o encontrado!";
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	JOptionPane.showMessageDialog(null, "A idade digitada foi: "+idade);
	if(idade>=18);
	{
		JOptionPane.showMessageDialog(null, "Voc� j� est� apto a tirar a CNH");
	}else {
		JOptionPane.showMessageDialog(null, "Desculpe! Voc� ainda n�o atingiu a idade suficiente para tirar sua CNH");
	}
		
