package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List_exer1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);
		String cor;
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("Digite cor:");
			cor = leia.next();
			cores.add(cor);
		}
		System.out.println("\nListar todas as cores:\n");
		for (String colors : cores) {
			System.out.println(colors);
		}
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:\n");
		for (String colors : cores) {
			System.out.println(colors);
		}

	}

}
