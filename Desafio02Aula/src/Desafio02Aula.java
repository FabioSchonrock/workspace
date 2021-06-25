import javax.swing.JOptionPane;

public class Desafio02Aula {

	public static int aleatorio() {
		return (int) Math.round(Math.random() * 3);
	}

	public static void main(String[] args) {
		
		Object[] opcoesJogo = new Object[3];
		opcoesJogo[0] = "Pedra";
		opcoesJogo[1] = "Papel";
		opcoesJogo[2] = "Tesoura";
		
		Object[] opcoesContinuar = {"Sim" , "Não"};
		int continuar = 0
				
		do {
		int escolha = JOptionPane.QUESTION_MESSAGE, null, opcoesJogo, opcoesJogo[2]);
		System.out.println(escolha);
		int cpu = aleatorio();
		String resultado = "";
		if((escolha == 0 && cpu == 2) || (escolha == 1 && cpu == 0) || (escolha == 2 && cpu == 1)) {
					resultado = "Vitória";
		} else if (escolha == cpu) {
			resultado = "Empate";
		} else {
			resultado = "Derrota";
		}
		
		continuar = JOptionPane.showOptionDialog(null, "Eu("+opcoesJogo[escolha]+") X Cpu("+opcoesJogo[cpu] + "\nResultado: " + resultado
				+ "\nJogar Novamente?", "Jogo", 0, JOptionPane.QUESTION_MESSAGE,null, opcoesContinuar, opcoesContinuar[0]);
		
		}while(continuar == 0);
		
		JOptionPane.showMessageDialog(null, "Placar Final" + "\nVitórias: " + v + "\nDerrotas: " + d + ""
				+ "\nDerrotas"
		
		
	}
}
