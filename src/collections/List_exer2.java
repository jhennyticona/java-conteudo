package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class List_exer2 {

	public static void main(String[] args) {

		ArrayList<Integer> valor = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

		int num, posicao;
		valor.add(2);
		valor.add(5);
		valor.add(1);
		valor.add(3);
		valor.add(4);
		valor.add(9);
		valor.add(7);
		valor.add(8);
		valor.add(10);
		valor.add(6);

		System.out.println("Digite o número que você deseja encontrar:");
		num = leia.nextInt();
		posicao = valor.indexOf(num);
		if (posicao >= 0)
			System.out.println("\nO número " + num + " está localizado na posição: " + posicao);
		else
			System.out.println("\nO número " + num + " não foi encontrado!");
		leia.close();
	}

}
