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

		// Operadores de comparações
		// int idade = 18;
//		System.out.println(idade > 17);
//		System.out.println(idade >= 18);
//		System.out.println(18 <= idade);
//		System.out.println(17 < idade);

		// Operadores Lógicos
		// boolean x1;
		// x1 = true;
		// operador lógico not (inverte o valor)x1 = ( Coloca ! antes da varriável)
		// System.out.println(!x1);
		// operador lógico or (OU)
		// boolean x2 = false;
		// System.out.println(!x1 || !x2);
		// operador lógico E
		// System.out.println(x1 && x2);

		// String txt = "Hel\blo World ";
		// System.out.println(txt);

		// String x = "10";
		// String y = "20";
		// String z = x + y;
		// System.out.println(z);

		// int x = -50;
		// System.out.println(Math.abs(x));

		// NÚMEROS ALEATÓRIOS

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

		// INSTRUÇÕES CONDICIONAIS

//		int x = 25;
//		if (x > 18) {
//			System.out.println(x + " é maior que 18");
//		} else {
//			System.out.println(x + " não é maior que 18");
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

		// CONDIÇÕES TERNÁRIAS
		// Código resumido do if_Else_if

		// int time = 11;
		// String result = (time < 18) ? "Good day." : "Good evening.";
		// System.out.println(result);

		// SWITCH JAVA (ESCOLHA CASO)

		int day = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7"));
		switch (day) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-feira");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça-feira");
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
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo");
		default:
			JOptionPane.showMessageDialog(null, "O número digitado não corresponde a nenhum dia da semana");
			break;
		}

	}
}
