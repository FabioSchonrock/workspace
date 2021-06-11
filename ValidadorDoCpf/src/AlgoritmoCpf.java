import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class AlgoritmoCpf {

	public static void main(String[] args) {
		
		String txtCpf = JOptionPane.showInputDialog("Digite o CPF:");
		String[] str = txtCpf.split("");
		
		
		
		int[] cpf = new int[11];
		cpf[0] = 1;
		cpf[1] = 1;
		cpf[2] = 1;
		cpf[3] = 4;
		cpf[4] = 4;
		cpf[5] = 4;
		cpf[6] = 7;
		cpf[7] = 7;
		cpf[8] = 7;
		cpf[9] = 0;
		cpf[10] = 0;

		int p = 0;
		int soma = 0;
		for (int i = 10; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;
			System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p++;
		}

		System.out.println(soma);
		// obter o resto da divisão 11/soma

		int resto = soma % 11;
		System.out.println(resto);

		// se o resto da divisão for menor que 2 digito verificador = 0
		// se não fazer a operação 11 (resto da divisão)

		if (resto < 2) {
			cpf[9] = 0;
		} else {
			cpf[9] = 11 - resto;
		}

		System.out.println("Primeiro dígito: " + cpf[9]);

		p = 0;
		soma = 0;

		for (int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;
			System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p++;
		}
		System.out.println(soma);

		resto = soma % 11;
		if (resto < 2) {
			cpf[10] = 0;
		} else {
			cpf[10] = 11 - resto;
		}
		
		String cpfValido = "";
		for (int i = 0; i <= 10; i++) {
			cpfValido += cpf[i];
		}
		
		String msg = "";
		if(cpfValido.equals(txtCpf)) {
			msg = "O CPF informado é válido" + cpfValido;
			} else {
				msg = "O CPF informado é inválido");
			}
	}
}
