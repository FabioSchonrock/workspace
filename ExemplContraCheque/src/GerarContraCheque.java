import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GerarContraCheque {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.##");

		float valorHora = 10f;

		String matricula = JOptionPane.showInputDialog("Digite a matrícula:");
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas:"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o restante dos minutos:"));
		float complementoHoras = minutos / 60;

		float salario = (horas * valorHora) + (complementoHoras * valorHora);
		
		System.out.println("Salário =" +salario);
		
		int diasUteis = 19;
		int domingosFeriados = 6;

		float dsr = (((horas + complementoHoras) / diasUteis) * domingosFeriados) * valorHora;
		
		System.out.println("Dsr = " +dsr);

		float salarioBruto = salario + dsr;
		
		System.out.println("Salário Bruto =" +salarioBruto);

		float valorInss = 0;

		float valorIr = 0;

		if (salarioBruto <= 1100) {
			valorInss = salarioBruto * 0.075f;
		} else if (salarioBruto > 1100 && salarioBruto <= 2203.48) {
			valorInss = ((salarioBruto - 1100) * 0.09f) + 82.5f;
		} else if (salarioBruto > 2203.48 && salarioBruto <= 3305.23) {
			valorInss = ((salarioBruto - 2203.48f) * 0.12f) + 181.81f;
		} else if (salarioBruto > 3305.23 && salarioBruto <= 6433.57) {
			valorInss = ((salarioBruto - 3305.23f) * 0.14f) + 314.01f;
		} else {
			valorInss = 751.99f - 38.89f;
		}
		
		System.out.println("Valor INSS = " +valorInss);
		
		//FAIXA 2
		if (salarioBruto > 1903.98f && salarioBruto <= 2826.65f) {
			valorIr = ((salarioBruto * 0.075f) - 142.8f);
		//FAIXA 3
		} else if (salarioBruto > 2826.65f && salarioBruto <= 3751.05f) {
			valorIr = ((salarioBruto * 0.15f) - 354.8f);
		//FAIXA 4
		} else if (salarioBruto > 3751.05f && salarioBruto <= 4664.68f) {
			valorIr = ((salarioBruto * 0.225f) - 636.13f);
		//FAIXA 5
		} else if (salarioBruto > 4664.68) {
			valorIr = (salarioBruto * 0.275f) - 869.36f;
		}		
		System.out.println("Valor IR =" +valorIr);

		float salarioLiquido = salarioBruto - valorInss - valorIr;
		
		System.out.println("Salário Líquido = " +salarioLiquido);

		JOptionPane.showMessageDialog(null,
				"** Contra Cheque **" + "\nMatricula: " + matricula + "/" + nome + "\nSalário Base: "
						+ df.format(salario) + "\nValor DSR: " + df.format(dsr) + "\nValor do INSS: "
						+ df.format(valorInss) + "\nValor do IR: " + df.format(valorIr) + "\nTotal Bruto: "
						+ df.format(salarioBruto) + "\nTotal Líquido: " + df.format(salarioLiquido));
	}
}
