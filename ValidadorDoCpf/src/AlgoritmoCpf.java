import java.util.Iterator;
import javax.swing.JOptionPane;

public class AlgoritmoCpf {

	public static void main(String[] args) {
	static int gerarNumeroEntre(int menorValor, int maiorValor) {
		int distancia = maiorValor - menorValor;
		return (int) (Math.random() * distancia) + menorValor;
	}

	static String formatarCpf(String txtCpf) {
		String[] arCpf = txtCpf.split("");
		int ctr = 0;
		String cpf = "";
		for (int i = 0; i <= 10; i++) {
			cpf += arCpf[i].toString();
			ctr++;
			if (ctr == 3 || ctr == 6) {
				cpf += ".";
			} else if (ctr == 9) {
				cpf += "-";
			}
		}
		return cpf;
	}

	public static void main(String[] args) {
		int[] cpf = new int[11];
		cpf[0] = 9;
		cpf[1] = 4;
		cpf[2] = 0;
		cpf[3] = 4;
		cpf[4] = 9;
		cpf[5] = 7;
		cpf[6] = 9;
		cpf[7] = 2;
		cpf[8] = 0;
//		cpf[9] = x;
//		cpf[10] = x;
// 		cpf = 111444777XX
		String txtCpf = " ";
		Object[] lsOpcoes = { "Gerar CPF", "Validar CPF" };
		int opcao = JOptionPane.showOptionDialog(null, "Escolha!", "Escolha!", 0, JOptionPane.WARNING_MESSAGE, null,
				lsOpcoes, lsOpcoes[0]);

		if (opcao == 1) {
			do {
				txtCpf = JOptionPane.showInputDialog("Digite o CPF:");
			} while (txtCpf.length() != 11);

			String[] str = txtCpf.split("");
			for (int i = 0; i <= 8; i++) {
				cpf[i] = Integer.parseInt(str[i]);
			}
		} else {
			for (int i = 0; i <= 8; i++) {
				cpf[i] = gerarNumeroEntre(0, 9);
			}

		}

		int p = 0;
		int soma = 0;
		
public static void main(String[] args) {

			int mult = i * cpf[p];
			soma = soma + mult;
			//System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p = p + 1; // p++ mesma coisa!
			

		}

		//System.out.println(soma);
		// obter o resto da divisão soma/11

		int resto = soma % 11;
		//System.out.println(resto);

		// se o resto da divisão for menor que 2 digito verificador = 0
		// se não fazer a operação 11-(resto da divisão)
		if (resto < 2) {
			cpf[9] = 0;
		} else {
			cpf[9] = 11 - resto;
		}

		//System.out.println("primeiro digito:"+cpf[9]);

		p = 0;
		soma = 0;
		
		for(int i = 11; i >= 2; i--) {

		for (int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;
			//System.out.println("i:" + i + ",p:" + p + ",cpf:" + cpf[p] + ",X:" + mult);
			p = p + 1; // p++ mesma coisa!
		}

		//System.out.println(soma);


		resto = soma % 11;
		if( resto < 2 ) {
		if (resto < 2) {
			cpf[10] = 0;
		}else {
		} else {
			cpf[10] = 11 - resto;
		}

		for(int i = 0; i <= 10; i++) {
			System.out.print(cpf[i]);

		String cpfValido = "";
		// convertendo o array de inteiro em uma string cpf
		for (int i = 0; i <= 10; i++) {
			cpfValido += cpf[i];
		}
		cpfValido = formatarCpf(cpfValido);

		String msg = "";
		if (cpfValido.equals(txtCpf) || opcao == 0) {
			msg = "Este é um CPF válido: " + cpfValido;
		} else {
			txtCpf = formatarCpf(txtCpf);
			msg = "O CPF informado é inválido:" + txtCpf + " != " + cpfValido;
		}

		JOptionPane.showMessageDialog(null, msg);

	}
		}}}}
}