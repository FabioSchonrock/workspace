import javax.swing.JOptionPane;

public class Aula27DeMaio {

	public static void main(String[] args) {
		// int sum1 = 100 + 50;
		// int sum2 = sum1 + 250;
		// int sum3 = sum2 + sum2;
		// System.out.println(sum3);

		// int x = 10;
		// x *= 5;
//		System.out.println(x);

		// Operadores de compara��es
		// int idade = 18;
//		System.out.println(idade > 17);
//		System.out.println(idade >= 18);
//		System.out.println(18 <= idade);
//		System.out.println(17 < idade);

		// Operadores L�gicos
		// boolean x1;
		// x1 = true;
		// operador l�gico not (inverte o valor)x1 = ( Coloca ! antes da varri�vel)
		// System.out.println(!x1);
		// operador l�gico or (OU)
		// boolean x2 = false;
		// System.out.println(!x1 || !x2);
		// operador l�gico E
		// System.out.println(x1 && x2);

		// String txt = "Hel\blo World ";
		// System.out.println(txt);

		// String x = "10";
		// String y = "20";
		// String z = x + y;
		// System.out.println(z);

		// int x = -50;
		// System.out.println(Math.abs(x));

		// N�MEROS ALEAT�RIOS

		// int randomNum = (int)(Math.random() * 101); // 0 to 100
		// System.out.println(randomNum);

		// int menorValor = 50;
		// int maiorValor = 100;
		// int distancia = maiorValor - menorValor;

		// System.out.println(++distancia);

		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);
		// System.out.println((int)(Math.random()*distancia)+menorValor);

		// INSTRU��ES CONDICIONAIS

//		int x = 25;
//		if (x > 18) {
//			System.out.println(x + " � maior que 18");
//		} else {
//			System.out.println(x + " n�o � maior que 18");
//		}
//	}

		// int time = 11;
		// if (time < 12) {
		// System.out.println("Bom dia!");
		// } else if (time < 18 && time > 12) {
		// System.out.println("Boa tarde");
		// } else {
		// System.out.println("Boa noite!");
		// }
		// }
		// }

		// CONDI��ES TERN�RIAS
		// C�digo resumido do if_Else_if

		// int time = 11;
		// String result = (time < 18) ? "Good day." : "Good evening.";
		// System.out.println(result);

		// SWITCH JAVA (ESCOLHA CASO)

		int day = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 7"));
		switch (day) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ter�a-feira");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-feira");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-feira");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-feira");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "S�bado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
		default:
			JOptionPane.showMessageDialog(null, "O n�mero digitado n�o corresponde a nenhum dia da semana");
			break;
		}

	}
}
