import java.net.PasswordAuthentication;

public class AulaDia02Junho {

	public static void main(String[] args) {
		// LAÇOS DE REPETIÇÃO
		// Java While Loop

		// int i = 0;
		// while (i < 100) {
		// System.out.println(i+1);
		// i = i + 1;
		// }

		// DO / WHILE
		// int i = 0;
		// do {
		// System.out.println(i);
		// i++;
		// } while (i < 5);

		// FOR
		// for (int i = 0; i < 10;i = i + 2) {
		// System.out.println(i);
		// }

		// FOR EACH

		// String[] lsCarro = {"Volvo", "BMW", "Ford", "Mazda"};
		// for (String carro : lsCarro) {
		// System.out.println(carro);
		// }

		// JAVA BREAK

		// for (int i = 0; i < 10; i++) {
		// if (i == 4) {
		// break;
		// }
		// System.out.println(i);
		// }

		// JAVA CONTINUE (PULA O VALOR)

		// for (int i = 0; i < 11; i++) {
		// if(i >= 4 && i <= 6) {
		// continue;
		// }
		// System.out.println(i);
		// }

		// BREAK AND CONTINUE IN WHILE

		// int i = 0;
		// while (i < 10) {
		// System.out.println(i);
		// i++;
		// if (i == 4) {
		// break;
		// }
		// }

		// int i = 0;
		// while (i < 10) {
		// if (i == 4) {
		// i++;
		// continue;
		// }
		// System.out.println(i);
		// i++;
		// }

		// ARRAYS JAVA
		// CRIANDO ARRAY DE STRING

		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		// CRIANDO ARRAY DE INTEIRO

		// int[] myNum = {10, 20, 30, 40};

		// ACESSANDO OS ELEMENTOS DE UMA ARRAY

		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// System.out.println(cars[0]);

		// ALTERAR UM ELEMENTO ARRAY

		// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// cars[2] = "Opel";
		// System.out.println(cars[2]);

		// COMPRIMENTO DA MATRIZ

		// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// System.out.println(cars.length);

		// LOOP POR MEIO DE UMA MATRIZ

		// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// for (int i = 0; i < cars.length; i++) {
		// System.out.println(cars[i]);
		// }

		// LOOP NA MATRIZ COM O FOR EACH

		// String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// for (String car : cars) {
		// System.out.println(car);
		// }

		// MATRIZES MULTIDIMENSIONAIS

		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// int x = myNumbers[1][2];
		// System.out.println(x);

		// LOOP DENTRO DE OUTRO LOOP

		//int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		//for (int i = 0; i < myNumbers.length; ++i) {
		//	for (int j = 0; j < myNumbers[i].length; ++j) {
		//		System.out.println("i:"+i+" j:"+j+" "+myNumbers[i][j]);	
		//	}
		
		//OUTRA FORMA DE DECLARAR UMA ARRAY
		
		//		int[] myNumbers = new int[4];
		//		myNumbers[0] = 1;
		//		myNumbers[1] = 2;
		//		myNumbers[2] = 3;
		//		myNumbers[3] = 4;		
		//		for (int i = 0; i <= myNumbers.length; ++i) {
		//			System.out.println(myNumbers[i]);
		//}
		
		//MAIS UM EXEMPLO
		
		//int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		//for (int i = 0; i < myNumbers.length; ++i) {
		//	System.out.println("i: "+i+" || dentro do j: "+myNumbers[i].length +" ");
		//	for (int j = 0; j < myNumbers[i].length; ++j) {
		//		System.out.println(myNumbers[i][j]+",");
		//	}
		//}
		
	}
}