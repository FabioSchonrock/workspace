
public class PraticaCpf {

	public static void main(String[] args) {
		int[] cpf = new int[11];

		cpf[0] = 9;
		cpf[1] = 0;
		cpf[2] = 0;
		cpf[3] = 1;
		cpf[4] = 1;
		cpf[5] = 6;
		cpf[6] = 6;
		cpf[7] = 0;
		cpf[8] = 1;
//	    cpf[9] = x;
//		cpf[10] = x;
		
		int mult = 0;
		int soma = 0;
		int p = 0;
		int dig1;
		int dig2;
		
		for (int i = 10; i >= 2; i--) {
			mult = cpf[p] * i;
			soma = mult + soma;
			p++;
		}
		
		int resto = 0;
		resto = soma%11;
		
		for () {
			
		}
		

	}

}