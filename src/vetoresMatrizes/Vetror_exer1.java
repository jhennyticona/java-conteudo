package vetoresMatrizes;

import java.util.Scanner;

public class Vetror_exer1 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num, posicao, vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		System.out.print("Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();
		posicao = -1;

		for (int i = 0; i < vetor.length; i++) {
			if (num == vetor[i]) {
				posicao = i;
			}
		}

		if (posicao != -1) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}
}
