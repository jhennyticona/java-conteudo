
package aula1;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Digite nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite nota 4: ");
		nota4 = leia.nextFloat();

		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("A media é: %.1f",media);
		
	}
}
