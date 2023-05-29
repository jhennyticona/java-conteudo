package vetoresMatrizes;

import java.util.Scanner;

public class Vetor_exer2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0, vetor[] = new int[10];
		float media;

		System.out.println("Digite os elementos do vetor:");

		for (int i = 0; i < 10; i++) {
			System.out.print("[" + i + "]: ");
			vetor[i] = leia.nextInt();
			soma += vetor[i];
		}
		media = (float) soma / 10;
		System.out.print("Elementos nos índices ímpares:");
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				System.out.print(vetor[i] + " ");
		}
		System.out.println();
		System.out.print("Elementos pares:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0)
				System.out.print(vetor[i] + " ");
		}
		System.out.println();
		System.out.print("Soma:" + soma);
		System.out.println();
		System.out.printf("Média: %.2f", media);

	}

}
