package vetoresMatrizes;

import java.util.Scanner;

public class Matriz_exer2 {

	public static void main(String[] args) {

		float matriz[][] = new float[10][4];
		float vetor[] = new float[10];
		int i, j;
		float soma = 0, media = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as notas dos participantes");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("[" + i + "][" + j + "]: ");
				matriz[i][j] = leia.nextFloat();
			}
		}
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 4; j++) {
				soma += matriz[i][j];
				media = soma / 4;
				vetor[i] = media;
			}
			soma = 0;
		}
		System.out.println("Vetor:");
		for (i = 0; i < 10; i++) {
			System.out.printf("%.1f|", vetor[i]);
		}
	}
}
