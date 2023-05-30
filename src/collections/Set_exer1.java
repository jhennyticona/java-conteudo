package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_exer1 {

	public static void main(String[] args) {
		Set<Integer> setValores = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);
		int i, num = 0;
		System.out.println("Digite 10 valores:");
		for (i = 0; i < 10; i++) {
			num = leia.nextInt();
			setValores.add(num);
		}
		Iterator<Integer> numeros = setValores.iterator();
		System.out.println("Listar dados do Set:");
		while (numeros.hasNext()) {
			System.out.println(numeros.next());
		}
	}
}
