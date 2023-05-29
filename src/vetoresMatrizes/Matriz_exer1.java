package vetoresMatrizes;

import java.util.Iterator;
import java.util.Scanner;

public class Matriz_exer1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int i, j, soma_principal = 0, soma_secundaria = 0;

		System.out.println("Digite os elementos da Matriz 3X3:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Digite um valor para a posição [" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		System.out.println("\nMatriz");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementos da Diagonal Principal:");
		for (i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
			soma_principal += matriz[i][i];
		}
		System.out.println("");

		System.out.println("Elementos da Diagonal Secundária:");
		for (i = 0; i < 3; i++) {
			System.out.print(matriz[i][2 - i] + " ");
			soma_secundaria += matriz[i][2 - i];
		}
		System.out.println("");
		System.out.println("Soma dos Elementos da Diagonal Principal:" + soma_principal);
		System.out.println("Soma dos Elementos da Diagonal Secundária:" + soma_secundaria);
	}
}
