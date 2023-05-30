package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_exer2 {

	public static void main(String[] args) {
		Set<Integer> setValores = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		int num;

		setValores.add(2);
		setValores.add(5);
		setValores.add(1);
		setValores.add(3);
		setValores.add(4);
		setValores.add(9);
		setValores.add(7);
		setValores.add(8);
		setValores.add(10);
		setValores.add(6);

		System.out.println("Digite o número que voce deseja encontrar");
		num = leia.nextInt();

		if (setValores.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		leia.close();
	}
}
